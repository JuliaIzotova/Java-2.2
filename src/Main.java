public class Main {
    public static void main(String[] args) {

        //Входные данные
        int userBalance = 100;
        int income = 1100;

        // Решение
        int bonus = 0;
        if (income > 1000) {
            bonus = income / 100;
        } 

        userBalance += income + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Баланс: " + userBalance);

    }

}

public class Main {
    public static void main(String[] args) {

        //Входные данные
        int userBalance = 100;
        int income = 1100;

        // Решение
        int bonus;
        if (income > 1000) {
            bonus = (int) income / 100;
        } else {
            bonus = 0;
        }
        userBalance += income + bonus;
        System.out.println("Бонус: ");
        System.out.println(bonus);
        System.out.println("Баланс: ");
        System.out.println(userBalance);

    }
}
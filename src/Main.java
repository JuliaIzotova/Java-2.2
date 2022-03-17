public class Main {
    public static void main(String[] args) {

        //Входные данные
      int userBalance = 90;
      int income = 6500;

      // Решение
        int bonus;
        if (income > 1000) {
            bonus = (int) income / 100;
        }
                else {
            bonus = 0;
        }
                userBalance += income + bonus;
        System.out.print("Бонус: ");
        System.out.println(bonus);
        System.out.print("Баланс: ");
        System.out.println(userBalance);

    }
}
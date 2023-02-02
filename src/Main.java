public class Main {
    public static void main(String[] args) {

        //вход
        int currentBalance = 10;
        int bonusReplenishment = 3000;
        boolean refill = (bonusReplenishment > 1000);

        int bonus;
        if (refill) {
            bonus = bonusReplenishment / 100 * 1;

        } else {
            bonus = 0;
        }
        int balance = currentBalance + bonusReplenishment + (bonusReplenishment / 100);

        System.out.println("Ваш баланс: " + balance);

    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RentACar hire = new RentACar();
        String renter = "Ekin";

        account.setAccountHolder(renter);
        account.setAmountOfMoney(10000);
        hire.setRenter(renter);

        System.out.println("Amount of money: " + account.getAmountOfMoney());
        account.withdrawMoney(3000);

        System.out.println("Account holder: " + account.getAccountHolder());

        System.out.println("Amount of money: " + account.getAmountOfMoney());

        System.out.println("Renter: " + hire.getRenter());
    }
}

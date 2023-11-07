public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        BankAccount account02 = new BankAccount("Hasan", 5000);
        BankAccount account03 = new BankAccount("Metin");

        RentCar rent = new RentCar();
        String renter = "Osman";

        account.setAccountHolder(renter);
        account.setAmountOfMoney(10000);

        rent.setRenter(renter);
        System.out.println("Amount of money: " + account.getAmountOfMoney());

        account.withdrawMoney(5000);
        account02.setActive(false);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Hasan's money: " + account02.getAmountOfMoney());
        System.out.println("Amount of money: " + account.getAmountOfMoney());
        System.out.println("Person renting the car: " + rent.getRenter());
        System.out.println("Second account holder: " + account02.getAccountHolder());
        System.out.println("Metin's money: " + account03.getAmountOfMoney());
    }
}

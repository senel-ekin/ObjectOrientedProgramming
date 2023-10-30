public class BankAccount {
    private String AccountHolder;
    private double AmountOfMoney;

    public BankAccount() {
        AccountHolder = "Indefinite";
        AmountOfMoney = 0.0;
    }

    public void addMoney(double amount) {
        AmountOfMoney = AmountOfMoney + amount;
    }

    public void withdrawMoney(double amount) {
        AmountOfMoney = AmountOfMoney - amount;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public double getAmountOfMoney() {
        return AmountOfMoney;
    }

    public void setAccountHolder(String name) {
        AccountHolder = name;
    }

    public void setAmountOfMoney(double amount) {
        AmountOfMoney = amount;
    }
}

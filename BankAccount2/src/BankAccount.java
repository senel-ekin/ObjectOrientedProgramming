public class BankAccount {
    private static final double COMISSION = 5.0;
    private String AccountHolder;
    private boolean isItActive;
    private double AmountOfMoney;

    public BankAccount() {
        AccountHolder = "Indefinite";
        AmountOfMoney = 0.0;
        setActive(false);
    }

    public BankAccount(String holder, double amount){
        AccountHolder = holder;
        AmountOfMoney = amount;
        setActive(true);
    }

    public BankAccount(String holder){
        AccountHolder = holder;
        AmountOfMoney = 1000;
    }

    public void addMoney(double amount) {
        if(isThisActive() && amount > 0)
            AmountOfMoney = AmountOfMoney + amount - COMISSION;
    }

    public void withdrawMoney(double amount) {
        if(isThisActive() && amount > 0)
            AmountOfMoney = AmountOfMoney - amount - COMISSION;
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

    public boolean isThisActive(){
        return isItActive;
    }

    public void setActive(boolean situation){
        isItActive = situation;
    }
}
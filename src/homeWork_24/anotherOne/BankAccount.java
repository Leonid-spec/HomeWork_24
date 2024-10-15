package homeWork_24.anotherOne;

public class BankAccount implements Payments{
    private double balance;
    private String currency;

    public BankAccount(double initialBalance, String currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Money out: " + amount + " " + currency);
        } else {
            System.out.println("You have mo enough money, Loser! ");
        }

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("You are luck: " + amount + " " + currency);
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance: " + balance + " " + currency);
        return balance;
    }

}

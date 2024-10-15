package homeWork_24.anotherOne;

public class ElectronicWallet implements Payments {
    private double balance;
    private String currency;

    public ElectronicWallet(double initialBalance, String currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Moneys out: " + amount + " " + currency);
        }else {
            System.out.println("Loser, you are have no money: " + amount + " " + currency);
        }

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Luck, you just get the money: " + amount + " " + currency);

    }
    @Override
public double checkBalance(){
        System.out.println("Balance: " + balance + " " + currency);
        return balance;
    }
}





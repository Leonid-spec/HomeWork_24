package homeWork_24.anotherOne;

public class BankTransaction {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(150000.25, "EURO");
        ElectronicWallet electronicWallet = new ElectronicWallet(250222.25, "BitCoin");

        bankAccount.checkBalance();
        bankAccount.depositTransfer(30540);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(60000);
        bankAccount.checkBalance();

        System.out.println("==================");

        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(12500);
        electronicWallet.checkBalance();
        electronicWallet.depositTransfer(458008);
        electronicWallet.checkBalance();


    }



}

public class BankClient {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2000);
        bankAccount.performWithdraw(1001);
        bankAccount.performWithdraw(1000);
        bankAccount.performDeposit(1000);
        bankAccount.performDeposit(1000);
    }
}

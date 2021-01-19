public class TransactionFeeState implements State {
    BankAccount bankAccount;

    public TransactionFeeState(BankAccount ba) {
        bankAccount = ba;
        System.out.println("TRANSACTION FEE STATE");
    }

    @Override
    public void withdraw(float amount) {
        bankAccount.setAccountDeposit(bankAccount.getAccountDeposit() - amount);
        if(bankAccount.getAccountDeposit() < 0) {
            bankAccount.setState(new OverdrawnState(bankAccount));
        }
    }

    @Override
    public void deposit(float amount) {
        bankAccount.setAccountDeposit(bankAccount.getAccountDeposit() + amount);
        if(bankAccount.getAccountDeposit() >= bankAccount.MIN_REQUIRED_DEPOSIT) {
            bankAccount.setState(new NoTransactionFeeState(bankAccount));
        }
    }
}

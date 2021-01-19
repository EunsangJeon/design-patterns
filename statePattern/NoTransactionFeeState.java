public class NoTransactionFeeState implements State {
    BankAccount bankAccount;

    public NoTransactionFeeState(BankAccount ba) {
        bankAccount = ba;
        System.out.println("NO TRANSACTION FEE STATE");
    }

    @Override
    public void withdraw(float amount) {
        bankAccount.setAccountDeposit(bankAccount.getAccountDeposit() - amount);
        if(bankAccount.getAccountDeposit() < bankAccount.MIN_REQUIRED_DEPOSIT) {
            bankAccount.setState(new TransactionFeeState(bankAccount));
        } else if(bankAccount.getAccountDeposit() < 0) {
            bankAccount.setState(new OverdrawnState(bankAccount));
        }
    }

    @Override
    public void deposit(float amount) {
        bankAccount.setAccountDeposit(bankAccount.getAccountDeposit() + amount);
    }
}

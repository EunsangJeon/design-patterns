public class OverdrawnState implements State {
    BankAccount bankAccount;

    public OverdrawnState(BankAccount ba) {
        bankAccount = ba;
        System.out.println("OVERDRAWN STATE");
    }

    @Override
    public void withdraw(float amount) {
        bankAccount.setAccountDeposit(bankAccount.getAccountDeposit() - amount);
    }

    @Override
    public void deposit(float amount) {
        bankAccount.setAccountDeposit(bankAccount.getAccountDeposit() + amount);
        if(bankAccount.getAccountDeposit() >= bankAccount.MIN_REQUIRED_DEPOSIT) {
            bankAccount.setState(new NoTransactionFeeState(bankAccount));
        } else if(bankAccount.getAccountDeposit() > 0) {
            bankAccount.setState(new TransactionFeeState(bankAccount));
        }
    }
}

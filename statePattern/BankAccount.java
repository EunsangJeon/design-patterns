

public class BankAccount {
    private State state;
    private float accountDeposit;
    public final float MIN_REQUIRED_DEPOSIT = 1000.0f;

    public BankAccount(float initialDeposit){
        accountDeposit = initialDeposit;

        if (accountDeposit < 0) {
            state = new OverdrawnState(this);
        } else if(accountDeposit < MIN_REQUIRED_DEPOSIT) {
            state = new TransactionFeeState(this);
        } else {
            state = new NoTransactionFeeState(this);
        }
    }

    public void performWithdraw(float amount) {
        state.withdraw(amount);
    }

    public void performDeposit(float amount) {
        state.deposit(amount);
    }

    public float getAccountDeposit() {
        return accountDeposit;
    }

    public void setAccountDeposit(float accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    public void setState(State state) {
        this.state = state;
    }
}

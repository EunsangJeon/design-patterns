public abstract class OperationComponent {
    protected int value;

    public OperationComponent(int n) {
        value = n;
    }

    public int getValue() {
        return value;
    }
    abstract public void addOperand(OperationComponent operand);
}

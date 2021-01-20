public class Operand extends OperationComponent {
    public Operand(int n) {
        super(n);
    }

    @Override
    public void addOperand(OperationComponent operand) {
        throw new UnsupportedOperationException();
    }
}

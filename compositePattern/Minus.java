import java.util.ArrayList;

public class Minus extends OperationComponent {
    ArrayList<OperationComponent> operands = new ArrayList<OperationComponent>();

    public Minus() {
        super(0);
    }

    @Override
    public void addOperand(OperationComponent operand) {
        if(operands.size() >= 2) {
            System.out.println("Only 2 operands are allowed.");
            return;
        }
        operands.add(operand);
    }

    @Override
    public int getValue() {
        value = operands.get(0).getValue() - operands.get(1).getValue();
        return super.getValue();
    }
}

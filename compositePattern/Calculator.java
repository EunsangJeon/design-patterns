public class Calculator {
    public static void main(String[] args) {
        OperationComponent op1 = new Operand(8);
        System.out.println(op1.getValue());

        OperationComponent op2 = new Operand(3);
        OperationComponent op3 = new Operand(4);
        OperationComponent op4 = new Plus();
        op4.addOperand(op2);
        op4.addOperand(op3);
        System.out.println(op4.getValue());

        OperationComponent op5 = new Operand(3);
        OperationComponent op6 = new Operand(2);
        OperationComponent op7 = new Operand(5);
        OperationComponent op8 = new Operand(4);
        OperationComponent op9 = new Operand(2);
        op1 = new Minus();
        op2 = new Plus();
        op3 = new Mult();
        op4 = new Div();
        op1.addOperand(op5);
        op1.addOperand(op6);
        System.out.println(op1.getValue());
        op2.addOperand(op7);
        op2.addOperand(op8);
        System.out.println(op2.getValue());
        op3.addOperand(op1);
        op3.addOperand(op2);
        System.out.println(op3.getValue());
        op4.addOperand(op3);
        op4.addOperand(op9);
        System.out.println(op4.getValue());
    }
}

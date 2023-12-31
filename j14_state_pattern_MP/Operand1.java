package j14_state_pattern_MP;

public class Operand1 implements State {
    private Calculator calc;

    public Operand1(Calculator calc) {
        this.calc = calc;
    }
    public void processDigit(int digit) {
        calc.setOperand1(digit);
    }

    public void processArithmeticOperator(char ch) {
        calc.setOperator(ch);
        calc.changeToOperatorState();
    }
}

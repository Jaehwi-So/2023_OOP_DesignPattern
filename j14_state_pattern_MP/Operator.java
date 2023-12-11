package j14_state_pattern_MP;

public class Operator implements State {
    private Calculator calc;

    public Operator(Calculator calc) {
        this.calc = calc;
    }

    public void processDigit(int digit) {
        calc.setOperand2(digit);
        calc.changeToOperand2State();
    }

    public void processArithmeticOperator(char ch) {
        calc.setOperator(ch);
    }
}

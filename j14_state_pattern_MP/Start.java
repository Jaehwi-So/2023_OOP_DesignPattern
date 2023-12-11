package j14_state_pattern_MP;

public class Start implements State {
    private Calculator calc;

    public Start(Calculator calc) {
        this.calc = calc;
    }

    public void processDigit(int digit) {
        calc.setOperand1(digit);
        calc.changeToOperand1State();
    }
}

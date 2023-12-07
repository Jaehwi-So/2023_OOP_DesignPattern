package j10_state_pattern;

public class Operand1 implements State{

    Calculator calculator;
    public Operand1(Calculator calc){
        this.calculator = calc;
    }

    public void processDigit(int digit) {
        this.calculator.addFirst(digit);
    }

    public void processArithmeticOperator(char ch) {
        
        this.calculator.setState(calculator.getOperator());
    }

    public void processEqualOperator() {
        System.out.println("invalid operation");
    }

}
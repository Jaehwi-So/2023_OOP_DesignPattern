package j14_state_pattern.state;

import j14_state_pattern.context.Calculator;

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
        this.calculator.process(ch);
    }

    public String toString(){
        return "Operand1 State";
    }
}
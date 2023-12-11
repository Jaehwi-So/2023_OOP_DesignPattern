package j14_state_pattern.state;

import j14_state_pattern.context.Calculator;

public class Operand2 implements State{

    Calculator calculator;
    public Operand2(Calculator calc){
        this.calculator = calc;
    }

    public void processDigit(int digit) {
        this.calculator.addSecond(digit);
    }


    public void processEqualOperator() {
        this.calculator.setResult();
        this.calculator.setState(this.calculator.getStart());
    }


    public String toString(){
        return "Operand2 State";
    }

}
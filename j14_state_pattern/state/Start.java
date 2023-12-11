package j14_state_pattern.state;

import j14_state_pattern.context.Calculator;

public class Start implements State{

    Calculator calculator;
    public Start(Calculator calc){
        this.calculator = calc;
    }

    public void processDigit(int digit) {
        this.calculator.init();
        this.calculator.setState(calculator.getOperand1());
        this.calculator.process(Integer.toString(digit).charAt(0));
    }

    public String toString(){
        return "Start State";
    }


}
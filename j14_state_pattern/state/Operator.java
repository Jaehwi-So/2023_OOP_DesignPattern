package j14_state_pattern.state;

import j14_state_pattern.context.Calculator;

public class Operator implements State {

    Calculator calculator;
    public Operator(Calculator calc){
        this.calculator = calc;
    }

    public void processArithmeticOperator(char ch) {
        this.calculator.setOp(ch);
        this.calculator.setState(calculator.getOperand2());
    }

    public String toString(){
        return "Opertor State";
    }

}
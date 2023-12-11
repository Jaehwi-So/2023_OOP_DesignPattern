package j14_state_pattern_MP;

public class Calculator {
    String operand1Str;
    String operand2Str;
    char op;
    int op1Int;
    int op2Int;
    int result;


    State state;
    State start;
    State operand1;
    State operand2;
    State operator;

    public Calculator() {
        start = new Start(this);
        operand1 = new Operand1(this);
        operand2 = new Operand2(this);
        operator = new Operator(this);
        state = start;
        operand1Str = "";
        operand2Str = "";
    }
    public void processDigit(int digit) {
        state.processDigit(digit);
    }

    public void processArithmeticOperator(char ch) {
        state.processArithmeticOperator(ch);
    }

    public void processEqualOperator() {
        state.processEqualOperator();
    }

    public void setOperand1(int digit) {
         operand1Str += digit;
    }

    public void setOperand2(int digit) {
        operand2Str += digit;
    }

    public void setOperator(char ch) {
        op = ch;
    }

    public void changeToOperand1State() {
        state = operand1;
    }

    public void changeToOperand2State() {
        state = operand2;
    }

    public void changeToOperatorState() {
        state = operator;
        op1Int = Integer.parseInt(operand1Str);
    }

    public void changeToStartState() {
        state = start;
        op2Int = Integer.parseInt(operand2Str);
        calc();
    }

    public void calc() {
        switch (op) {
            case '+':
                result = op1Int + op2Int;
                break;
            case '-':
                result = op1Int - op2Int;
                break;
            case '*':
                result = op1Int * op2Int;
                break;
            case '/':
                result = op1Int / op2Int;
                break;
            case '%':
                result = op1Int % op2Int;
                break;
        }
        reset();
    }

    public int getResult() { return result; }

    public int getOperand1() { return op1Int; }
    public int getOperand2() { return op2Int; }

    public char getOperator() { return op; }
    private void reset() {
        operand1Str = "";
        operand2Str = "";
    }
}

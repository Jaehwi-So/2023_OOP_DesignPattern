package j14_state_pattern.context;

import j14_state_pattern.state.*;

public class Calculator {
    /* 현재 상태 */
    State state;

    /* 가질 수 있는 State */
    State start;
    State operand1;
    State operator;
    State operand2;

    private String first; //첫 번째 피연산자
    private String second; //두 번째 피연산자
    private char op; //연산자
    String result; //결과값 저장

    public Calculator(){
        this.start = new Start(this);
        this.operand1 = new Operand1(this);
        this.operand2 = new Operand2(this);
        this.operator= new Operator(this);
        this.state = this.start;
    }

    /* 현재 상태 변경 */
    public void setState(State state){
        System.out.println(this.state.toString() + " -> " + state.toString());
        this.state = state;
    }
    public State getStart() {
        return start;
    }
    public State getOperand1() {
        return operand1;
    }

    public State getOperator() {
        return operator;
    }

    public State getOperand2() {
        return operand2;
    }




    /* State에 따른 동작 수행 */
    public void process(char ch) {
        //연산자에 대한 State가 행동해야 할 메서드
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            this.state.processArithmeticOperator(ch);
        }
        //Equal 연산자에 대한 State가 행동해야 할 메서드
        else if(ch == '='){
            this.state.processEqualOperator();
        }
        //Digit에 대한 State가 행동해야 할 메서드
        else if(Character.isDigit(ch)){
            int i = Character.getNumericValue(ch);
            this.state.processDigit(i);
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    // 첫 번째 피연산자의 수 추가입력 (1,2,3,4 -> 1234)
    public void addFirst(int i){
        this.first = this.first.concat(Integer.toString(i));
    }

    // 두 번째 피연산자의 수 추가입력 (1,2,3,4 -> 1234)
    public void addSecond(int i){
        this.second = this.second.concat(Integer.toString(i));
    }

    // 연산자 설정
    public void setOp(char op){
        this.op = op;
    }

    // 결과 설정
    public void setResult(){
        double n1 = Double.parseDouble(this.first);
        double n2 = Double.parseDouble(this.second);
        double res = 0;
        switch(op){
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            default:
                break;
        }
        this.result = String.format("%s %c %s = %.1f", this.first, this.op, this.second, res);
        System.out.println(result);

    }

    //계산기 초기화
    public void init(){
        this.first = "";
        this.second = "";
    }


}

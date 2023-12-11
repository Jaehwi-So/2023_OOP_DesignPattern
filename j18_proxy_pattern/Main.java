package j18_proxy_pattern;

import j18_proxy_pattern.proxy.CalculatorProxy;
import j18_proxy_pattern.subject.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorProxy();

        // 실제로 RealCalculator가 호출됨
        int result = calculator.add(5, 3);
        System.out.println("Result: " + result);

        // 이미 생성된 RealCalculator를 사용하여 다시 호출
        int resultAgain = calculator.add(10, 7);
        System.out.println("Result Again: " + resultAgain);
    }
}

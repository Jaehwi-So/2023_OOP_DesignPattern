package j18_proxy_pattern.proxy;


import j18_proxy_pattern.realsubject.RealCalculator;
import j18_proxy_pattern.subject.Calculator;

public class CalculatorProxy implements Calculator {
    private RealCalculator realCalculator;

    @Override
    public int add(int a, int b) {
        if (realCalculator == null) {
            realCalculator = new RealCalculator();
        }
        return realCalculator.add(a, b);
    }
}
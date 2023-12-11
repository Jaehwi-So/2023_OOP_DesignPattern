package j18_proxy_pattern.realsubject;

import j18_proxy_pattern.subject.Calculator;

public class RealCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("Adding " + a + " and " + b);
        return a + b;
    }
}

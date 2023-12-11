package j06_decorator_pattern_coffee;

import j06_decorator_pattern_coffee.component.BevarageDarkRoast;
import j06_decorator_pattern_coffee.component.Beverage;
import j06_decorator_pattern_coffee.decorator.MochaDecorator;
import j06_decorator_pattern_coffee.decorator.WhipDecorator;

public class Main {
    public static void main(String[] args){
        Beverage b = new BevarageDarkRoast();
        System.out.println(b.getDescription() + " " + b.cost()); //다크로스트 1000.0

        b = new MochaDecorator(b);
        System.out.println(b.getDescription() + " " + b.cost()); //모카 다크로스트 1500.0

        b = new WhipDecorator(b);
        System.out.println(b.getDescription() + " " + b.cost()); //휘핑 모카 다크로스트 1800.0
    }
}

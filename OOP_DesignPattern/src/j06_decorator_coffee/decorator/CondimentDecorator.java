package j06_decorator_coffee.decorator;

import j06_decorator_coffee.component.Beverage;

//Decorator
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

}

package j06_decorator_coffee.decorator;


import j06_decorator_coffee.component.Beverage;

//ConcreteDecorator
public class MochaDecorator extends CondimentDecorator{
    Beverage beverage;

    public MochaDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 500;
    }

    @Override
    public String getDescription() {
        return "모카 " + this.beverage.getDescription();
    }
}

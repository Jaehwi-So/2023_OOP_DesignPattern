package j06_decorator_coffee;


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

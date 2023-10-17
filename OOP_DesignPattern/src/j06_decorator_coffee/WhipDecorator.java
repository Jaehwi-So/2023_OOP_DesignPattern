package j06_decorator_coffee;


//ConcreteDecorator
public class WhipDecorator extends CondimentDecorator{
    Beverage beverage;

    public WhipDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 300;
    }

    @Override
    public String getDescription() {
        return "휘핑 " + this.beverage.getDescription();
    }
}

package j06_decorator_pattern_coffee.component;


//ConcreteComponent
public class BevarageDarkRoast extends Beverage{
    public BevarageDarkRoast(){
        this.description = "다크로스트";
    }

    @Override
    public double cost() {
        return 1000;
    }
}

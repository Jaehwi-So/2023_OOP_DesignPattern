package j06_decorator_coffee.component;


//ConcreteComponent
public class BevarageEspresso extends Beverage{
    public BevarageEspresso(){
        this.description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1000;
    }
}

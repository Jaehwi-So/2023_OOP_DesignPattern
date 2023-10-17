package j06_decorator_pattern;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getName(){
        return "치즈 " + pizza.getName();
    }

    @Override
    public int getPrice(){
        return ToppingsPrice.CHEESE + pizza.getPrice();
    }


}

package j06_decorator_pattern_pizza.decorator;

import j06_decorator_pattern_pizza.component.Pizza;
import j06_decorator_pattern_pizza.ToppingsPrice;

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

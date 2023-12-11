package j06_decorator_pattern_pizza.decorator;

import j06_decorator_pattern_pizza.component.Pizza;
import j06_decorator_pattern_pizza.ToppingsPrice;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getName(){
        return "페퍼로니 " + pizza.getName();
    }

    @Override
    public int getPrice(){
        return ToppingsPrice.PEPPERONI + pizza.getPrice();
    }


}

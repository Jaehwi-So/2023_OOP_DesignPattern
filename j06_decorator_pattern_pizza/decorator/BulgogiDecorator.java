package j06_decorator_pattern_pizza.decorator;

import j06_decorator_pattern_pizza.component.Pizza;
import j06_decorator_pattern_pizza.ToppingsPrice;

public class BulgogiDecorator extends PizzaDecorator{

    public BulgogiDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getName(){
        return "불고기 " + pizza.getName();
    }

    @Override
    public int getPrice(){
        return ToppingsPrice.BULGOGI + pizza.getPrice();
    }


}

package j06_decorator_pizza.decorator;

import j06_decorator_pizza.component.Pizza;
import j06_decorator_pizza.ToppingsPrice;

public class PotatoDecorator extends PizzaDecorator{

    public PotatoDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getName(){
        return "포테이토 " + pizza.getName();
    }

    @Override
    public int getPrice(){
        return ToppingsPrice.POTATO + pizza.getPrice();
    }


}

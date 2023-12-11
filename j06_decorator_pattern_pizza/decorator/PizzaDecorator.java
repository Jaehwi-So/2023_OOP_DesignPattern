package j06_decorator_pattern_pizza.decorator;

import j06_decorator_pattern_pizza.component.Pizza;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getName(){
        return pizza.getName();
    }

    @Override
    public int getPrice(){
        return pizza.getPrice();
    }

    @Override
    public int getSize(){
        return pizza.getSize();
    }



}

package j08_factory_method_pattern.store;

import j08_factory_method_pattern.pizza.Pizza;

//Creator
public abstract class PizzaStore {

    void prepareToBoxing(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        prepareToBoxing(pizza);
        return pizza;
    }

    //구현을 서브 클래스에 위임
    abstract Pizza createPizza(String type);
}
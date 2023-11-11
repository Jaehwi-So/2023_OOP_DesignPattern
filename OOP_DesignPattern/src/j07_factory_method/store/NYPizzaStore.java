package j07_factory_method.store;


import j07_factory_method.pizza.NYStyleCheesePizza;
import j07_factory_method.pizza.NYStyleClamPizza;
import j07_factory_method.pizza.NYStyleVeggiePizza;
import j07_factory_method.pizza.Pizza;

//ConcreteCreator
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new NYStyleClamPizza();
        } else {
            return null;
        }
    }
}
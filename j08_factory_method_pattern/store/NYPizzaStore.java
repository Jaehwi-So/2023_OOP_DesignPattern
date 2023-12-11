package j08_factory_method_pattern.store;


import j08_factory_method_pattern.pizza.NYStyleCheesePizza;
import j08_factory_method_pattern.pizza.NYStyleClamPizza;
import j08_factory_method_pattern.pizza.NYStyleVeggiePizza;
import j08_factory_method_pattern.pizza.Pizza;

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
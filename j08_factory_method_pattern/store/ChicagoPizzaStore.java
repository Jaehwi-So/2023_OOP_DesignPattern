package j08_factory_method_pattern.store;


import j08_factory_method_pattern.pizza.ChicagoStyleCheesePizza;
import j08_factory_method_pattern.pizza.ChicagoStyleClamPizza;
import j08_factory_method_pattern.pizza.ChicagoStyleVeggiePizza;
import j08_factory_method_pattern.pizza.Pizza;

//ConcreteCreator
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new ChicagoStyleClamPizza();
        } else {
            return null;
        }
    }
}
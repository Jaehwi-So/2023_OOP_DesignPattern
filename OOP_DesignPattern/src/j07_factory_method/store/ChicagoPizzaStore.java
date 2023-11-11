package j07_factory_method.store;


import j07_factory_method.pizza.ChicagoStyleCheesePizza;
import j07_factory_method.pizza.ChicagoStyleClamPizza;
import j07_factory_method.pizza.ChicagoStyleVeggiePizza;
import j07_factory_method.pizza.Pizza;

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
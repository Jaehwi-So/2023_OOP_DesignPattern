package j08_factory_method_pattern;

import j08_factory_method_pattern.pizza.Pizza;
import j08_factory_method_pattern.store.ChicagoPizzaStore;
import j08_factory_method_pattern.store.NYPizzaStore;
import j08_factory_method_pattern.store.PizzaStore;

public class Main {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese"); //뉴욕 치즈피자
        Pizza nyClamPizza = nyStore.orderPizza("clam"); //뉴욕 조개피자

        Pizza chicagoCheesePizza = chicagoStore.orderPizza("cheese"); //시카고 치즈피자
        Pizza chicagoClamPizza = chicagoStore.orderPizza("clam"); //시카고 조개피자
    }
}

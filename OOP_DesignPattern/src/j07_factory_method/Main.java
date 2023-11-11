package j07_factory_method;

import j07_factory_method.pizza.Pizza;
import j07_factory_method.store.ChicagoPizzaStore;
import j07_factory_method.store.NYPizzaStore;
import j07_factory_method.store.PizzaStore;

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

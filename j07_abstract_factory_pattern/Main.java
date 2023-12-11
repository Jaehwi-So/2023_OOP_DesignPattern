package j07_abstract_factory_pattern;


import j07_abstract_factory_pattern.pizza.Pizza;
import j07_abstract_factory_pattern.store.NYPizzaStore;
import j07_abstract_factory_pattern.store.PizzaStore;

public class Main {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese"); //뉴욕 치즈피자
        Pizza nyClamPizza = nyStore.orderPizza("clam"); //뉴욕 조개피자

    }
}

package j07_abstract_factory_pattern.store;


import j07_abstract_factory_pattern.factory.NyPizzaIngredientFactory;
import j07_abstract_factory_pattern.factory.PizzaIngredientFactory;
import j07_abstract_factory_pattern.pizza.CheesePizza;
import j07_abstract_factory_pattern.pizza.ClamPizza;
import j07_abstract_factory_pattern.pizza.Pizza;
import j07_abstract_factory_pattern.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        // 뉴욕피자 원재료 공장 전달.

        if(item.equals("cheese")){
            //사용재료 팩토리 각 피자 객체에 전달.
            pizza = new CheesePizza(ingredientFactory);
            // 피자마다 새로운 인스턴스 만들고 원재료 공급받는데 필요한 팩토리 지정.
            pizza.setName("Cheese Pizza");
        }
        else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Clam Pizza");
        }
        else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Veggie Pizza");
        }
        return pizza;
    }
}
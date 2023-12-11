package j07_abstract_factory_pattern.pizza;

import j07_abstract_factory_pattern.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

        this.clams = ingredientFactory.createClam();
        System.out.println("Preparing : " + name);
        System.out.println("Preparing Clams : " + clams);

    }
}
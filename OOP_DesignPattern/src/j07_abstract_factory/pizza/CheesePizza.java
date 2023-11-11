package j07_abstract_factory.pizza;

import j07_abstract_factory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.cheese = ingredientFactory.createCheese();
        System.out.println("Preparing : " + name);
        System.out.println("Preparing Cheese : " + cheese);
    }
}
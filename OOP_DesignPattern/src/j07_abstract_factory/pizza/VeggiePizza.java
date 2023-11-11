package j07_abstract_factory.pizza;

import j07_abstract_factory.factory.PizzaIngredientFactory;
import j07_abstract_factory.ingredients.Veggies;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.veggies = ingredientFactory.createVeggies();
        System.out.println("Preparing : " + name);
        for(Veggies veggie : veggies){
            System.out.println("Preparing Veggie : " + veggie);
        }

    }
}
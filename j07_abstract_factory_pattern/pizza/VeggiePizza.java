package j07_abstract_factory_pattern.pizza;

import j07_abstract_factory_pattern.factory.PizzaIngredientFactory;
import j07_abstract_factory_pattern.ingredients.Veggies;

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
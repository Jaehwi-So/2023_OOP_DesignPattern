package j07_abstract_factory_pattern.factory;

import j07_abstract_factory_pattern.ingredients.Cheese;
import j07_abstract_factory_pattern.ingredients.Clams;
import j07_abstract_factory_pattern.ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();
}

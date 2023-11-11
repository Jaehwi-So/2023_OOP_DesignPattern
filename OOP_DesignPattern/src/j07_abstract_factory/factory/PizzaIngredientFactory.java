package j07_abstract_factory.factory;

import j07_abstract_factory.ingredients.Cheese;
import j07_abstract_factory.ingredients.Clams;
import j07_abstract_factory.ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();
}

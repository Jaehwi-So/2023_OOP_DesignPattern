package j07_abstract_factory.factory;

import j07_abstract_factory.ingredients.Cheese;
import j07_abstract_factory.ingredients.*;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] =
                { new Farlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}

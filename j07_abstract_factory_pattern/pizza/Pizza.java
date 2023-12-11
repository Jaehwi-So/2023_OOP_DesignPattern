package j07_abstract_factory_pattern.pizza;

import j07_abstract_factory_pattern.ingredients.Cheese;
import j07_abstract_factory_pattern.ingredients.Clams;
import j07_abstract_factory_pattern.ingredients.Veggies;

public abstract class Pizza {
    String name;
    Veggies veggies[];
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking");
    }

    public void box() {
        System.out.println("boxing");
    }

    public void cut() {
        System.out.println("cutting");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
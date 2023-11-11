package j07_factory_method.pizza;


//Product
public abstract class Pizza {
    String name;
    String dough;

    public void prepare() {
        System.out.println("preparing : " + name);
        System.out.println("prepare dough : " + dough);
    }

    public void bake() {
        System.out.println("baking");
    }

    public void box() {
        System.out.println("boxing");
    }

    public void cut() {
        System.out.println("cutting");
    }

    public String getName() {
        return name;
    }
}
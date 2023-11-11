package j06_decorator_pizza.component;
public class SelectToppingPizza implements Pizza {
    private int size;
    private String name;
    private int price;
    
    public SelectToppingPizza(int size) {
        this.size = size;
        this.name = "피자";
        this.price = 20000;
    }
    public int getSize() { return this.size; }
    public String getName() { return this.name; }
    public int getPrice() { return this.price; }
}

package j06_decorator_non;
class PepperoniPizza {
    private int size;
    private String name;
    private int price;
    
    public PepperoniPizza(int size) {
        this.size = size;
        name = "페퍼로니 피자"; // "페퍼로니 " + "피자"
        price = 20000 + ToppingsPrice.PEPPERONI;
    }
    public int getSize() { return size; }
    public String getName() { return name; }
    public int getPrice() { return price; }
}
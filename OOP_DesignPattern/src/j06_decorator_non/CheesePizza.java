package j06_decorator_non;
class CheesePizza {
    private int size;
    private String name;
    private int price;
    
    public CheesePizza(int size) {
        this.size = size;
        name = "치즈 피자"; // "치즈 " + "피자"
        price = 20000 + ToppingsPrice.CHEESE;        
    }
    public int getSize() { return size; }
    public String getName() { return name; }
    public int getPrice() { return price; }
}
package j06_decorator_non;
class PepperoniCheesePizza extends Pizza  {
    PepperoniCheesePizza(int size) {
        super(size);
    }
    public String getName() { return "페퍼로니 " + "치즈 " + super.getName(); }    
    public int getPrice() { return ToppingsPrice.PEPPERONI + ToppingsPrice.CHEESE + super.getPrice(); }
}
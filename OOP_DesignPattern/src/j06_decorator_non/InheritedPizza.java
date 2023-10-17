package j06_decorator_non;

class InheritedPepperoniPizza extends Pizza {
    public InheritedPepperoniPizza(int size) {
        super(size);
    }
    public String getName() { return "페퍼로니 " + super.getName(); }
    public int getPrice() { return ToppingsPrice.PEPPERONI + super.getPrice(); }
}

class InheritedCheesePizza extends Pizza {
    public InheritedCheesePizza(int size) {
        super(size);
    }
    public String getName() { return "치즈 " + super.getName(); }
    public int getPrice() { return ToppingsPrice.CHEESE + super.getPrice(); }
}
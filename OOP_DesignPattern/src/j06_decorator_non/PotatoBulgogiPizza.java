package j06_decorator_non;
class PotatoBulgogiPizza extends Pizza {
    PotatoBulgogiPizza(int size) {
        super(size);
    }
    public String getName() { return "감자 " + "불고기 " + super.getName(); }
    public int getPrice() { return ToppingsPrice.POTATO + ToppingsPrice.BULGOGI + super.getPrice(); }
}
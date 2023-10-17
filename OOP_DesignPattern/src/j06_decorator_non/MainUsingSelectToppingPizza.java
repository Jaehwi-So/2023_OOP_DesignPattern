package j06_decorator_non;

import java.util.List;


//이거 확인
class MainUsingSelectToppingPizza {
    public static void main(String[] args) {
        List<String> list;
        LoadToppings loadToppings = new LoadToppings("src/j06_decorator/toppings.txt");
        list = loadToppings.load();
    
        SelectToppingPizza pizza = new SelectToppingPizza(15);
        for (String topping : list) {
            pizza.addTopping(topping);
        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
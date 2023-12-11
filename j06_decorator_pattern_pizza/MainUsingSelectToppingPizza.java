package j06_decorator_pattern_pizza;

import j06_decorator_pattern_pizza.component.Pizza;
import j06_decorator_pattern_pizza.component.SelectToppingPizza;
import j06_decorator_pattern_pizza.decorator.BulgogiDecorator;
import j06_decorator_pattern_pizza.decorator.CheeseDecorator;
import j06_decorator_pattern_pizza.decorator.PepperoniDecorator;
import j06_decorator_pattern_pizza.decorator.PotatoDecorator;

import java.util.List;

//이거 확인
class MainUsingSelectToppingPizza {
    public static void main(String[] args) {
        List<String> list;
        LoadToppings loadToppings = new LoadToppings("src/j06_decorator_pattern/toppings.txt");
        list = loadToppings.load();
    
        Pizza pizza = new SelectToppingPizza(15);
        for (String topping : list) {
            switch (topping) {
                case "Pepperoni":
                    pizza = new PepperoniDecorator(pizza);
                    break;

                case "Cheese":
                    pizza = new CheeseDecorator(pizza);
                    break;

                case "Potato":
                    pizza = new PotatoDecorator(pizza);
                    break;

                case "Bulgogi":
                    pizza = new BulgogiDecorator(pizza);
                    break;

                default:
                    System.out.println("Invalide topping\n");
                    break;
            }
        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
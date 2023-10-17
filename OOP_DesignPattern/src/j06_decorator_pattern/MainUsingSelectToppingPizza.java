package j06_decorator_pattern;

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
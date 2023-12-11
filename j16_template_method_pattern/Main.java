package j16_template_method_pattern;

import j16_template_method_pattern.abstract_class.CaffeineBeverage;
import j16_template_method_pattern.concrete_class.Coffee;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage bev = new Coffee();
        bev.prepareRecipe();
    }
}

package j16_template_method_pattern.concrete_class;

import j16_template_method_pattern.abstract_class.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    public void brew(){
        System.out.println("필터로 커피를 우려내는 중");
    }

    public void addCondiments(){
        System.out.println("설탕과 우유를 추가하는 중");
    }

}

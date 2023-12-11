package j16_template_method_pattern.concrete_class;

import j16_template_method_pattern.abstract_class.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    public void brew(){
        System.out.println("차를 우려내는 중");
    }

    public void addCondiments(){
        System.out.println("레몬을 추가하는 중");
    }

}

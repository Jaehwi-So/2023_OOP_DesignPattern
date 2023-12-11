package j16_template_method_pattern.abstract_class;

public abstract class CaffeineBeverage {

    // 템플릿 메서드
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }
    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("물 끓이는 중");
    }

    public void pourInCup(){
        System.out.println("컵에 따르는 중");
    }
}

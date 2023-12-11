package j11_adapter_pattern;

public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        System.out.println("The Turkey says..."); turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says..."); testDuck(duck);

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("\nThe TurkeyAdapter says..."); testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

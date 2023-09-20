package j02ex_DefaultInterface;

interface B {
    default void print() {
        System.out.println("B");
    }
}
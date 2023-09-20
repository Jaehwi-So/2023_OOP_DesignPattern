package j02ex_DefaultInterface;

interface A {
    default void print() {
        System.out.println("A");
    }
}
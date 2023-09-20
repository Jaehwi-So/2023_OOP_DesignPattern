package j02ex_DefaultInterface;

class UseInterface implements A, B {
    public void usePrint() {
        print();
    }
    
    public void print() {
        System.out.println("UseInterface");
    }
    
    public static void main(String[] args) {
        UseInterface ui = new UseInterface();
        ui.usePrint();    
    }
}
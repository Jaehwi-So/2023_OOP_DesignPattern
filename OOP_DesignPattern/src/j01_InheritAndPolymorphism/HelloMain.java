package j01_InheritAndPolymorphism;

class HelloMain {
    public static void main(String[] args){
//        Hello h = new Hello();
//        h.sayHello(); // “영어로 인사” 출력

        Hello h2 = new HelloChinese();  //부모 클래스 형 변수에 자식 클래스 인스턴스 할당
        Hello h3 = new HelloKorean();

        h2.sayHello();
        h3.sayHello();
    }
}
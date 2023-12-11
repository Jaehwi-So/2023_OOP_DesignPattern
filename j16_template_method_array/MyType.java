package j16_template_method_array;

public class MyType implements Comparable<MyType> {
    private int value;

    public MyType(int value){
        this.value = value;
    }

    @Override
    public int compareTo(MyType comp) {
        // 이 객체의 value와 다른 객체의 value를 비교하여 순서를 결정
        return Integer.compare(comp.value, this.value);
    }

    @Override
    public String toString(){
        return this.value + "";
    }

}

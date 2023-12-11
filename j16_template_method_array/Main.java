package j16_template_method_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyType[] myArray = {new MyType(5), new MyType(2), new MyType(8)};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}

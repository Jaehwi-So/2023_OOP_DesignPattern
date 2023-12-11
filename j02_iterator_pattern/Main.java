package j02_iterator_pattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>();
        System.out.println("Push 1, 2, 3, 4");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Iterator iter1 = stack.iterator();
        while(iter1.hasNext()){
            System.out.println("Print Stack :" + iter1.next());
        }

        for(Iterator iter2 = stack.iterator(); iter2.hasNext();){
            System.out.println("Print Stack :" + iter2.next());
        }
        for(Integer s : stack){
            System.out.println("Print Stack :" + s);
        }



        System.out.println("Pop Stack : " + stack.pop());
        System.out.println("Pop Stack: " + stack.pop());
        for(Integer s : stack){
            System.out.println("Print Stack :" + s);
        }
        System.out.println("Push 5, 6");
        stack.push(5);
        stack.push(6);
        for(Integer s : stack){
            System.out.println("Print Stack :" + s);
        }
        System.out.println("Pop Stack : " + stack.pop());
        for(Integer s : stack){
            System.out.println("Print Stack :" + s);
        }

    }
}

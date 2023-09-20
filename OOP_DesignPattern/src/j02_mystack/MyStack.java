package j02_mystack;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<E> implements Iterable<E>  {
    ArrayList<E> list;
    public MyStack(){
        this.list = new ArrayList<>();
    }
    public void push(E e){
        this.list.add(e);
    }
    public E pop(){
        int index = this.list.size() - 1;
        E element = this.list.get(index);
        this.list.remove(index);
        return element;
    }
    public boolean isEmpty(){
        if(this.list.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public Iterator<E> iterator(){
        return new MyStackIterator<E>(this.list);
    }


}

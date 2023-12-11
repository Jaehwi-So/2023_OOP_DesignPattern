package j02_iterator_pattern;

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
    @Override
    public Iterator<E> iterator(){
        return new MyStackIterator<E>(this.list);
    }

}

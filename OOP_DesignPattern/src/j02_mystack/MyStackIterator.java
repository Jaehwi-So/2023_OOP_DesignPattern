package j02_mystack;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStackIterator<T> implements Iterator<T> {
    ArrayList<T> list;
    int idx;

    public MyStackIterator(ArrayList<T> list){
        this.list = list;
        this.idx = 0;
    }
    @Override
    public boolean hasNext() {
        return (this.list.size() - 1) >= this.idx;
    }

    @Override
    public T next() {
        this.idx++;
        return list.get(idx - 1);
    }
}

package t2_1;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration<Object> {
    Iterator<Object> iterator;

    public IteratorAdapter(Iterator<Object> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}

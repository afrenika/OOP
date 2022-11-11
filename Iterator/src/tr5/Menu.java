package tr5;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
    public default Iterator<MenuItem> createAlternativeIterator(){throw new UnsupportedOperationException();}
}

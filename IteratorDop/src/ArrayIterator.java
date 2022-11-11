import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    T[] items;
    int position = 0;
    public ArrayIterator(T[] items) {
        this.items = items;}

    @Override
    public T next() {
        T menuItem = items[position];
        position = position + 1;
        return menuItem;}

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;}

    @Override
    public void remove() {
        throw new UnsupportedOperationException
                ("You shouldn't be trying to remove menu items.");}
}


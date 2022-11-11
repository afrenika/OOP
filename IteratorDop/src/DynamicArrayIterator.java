import java.util.Iterator;

public class DynamicArrayIterator<T extends Comparable<T>> implements Iterator<T> {

    DynamicArray<T> items;
    int position = 0;

    public DynamicArrayIterator(DynamicArray<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length() && items.elemAt(position) != null;
    }

    @Override
    public T next() {
        T menuItem = items.elemAt(position);
        position++;
        return menuItem;
    }
}

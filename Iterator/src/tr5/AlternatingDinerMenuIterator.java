package tr5;

import java.util.Iterator;
import java.util.Calendar;


public class AlternatingDinerMenuIterator implements Iterator<MenuItem>{

    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2; }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;}

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
    public void remove() {
        throw new UnsupportedOperationException(
                "Alternating Diner Menu Iterator does not support remove()");}

}


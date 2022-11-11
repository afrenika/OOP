
import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T extends Comparable<T>> {
    private static final int defaltSize = 16;
    private Object [] massiv;
    private int size;


    public DynamicArray(int length) {
        if (length > 0){
            massiv = new Object[length];
            size = 0;
        }
        else if (length == 0){
            massiv = new Object[]{};
            size = 0;
        }
        else {
            throw new IllegalArgumentException("Illegal Capacity: "+ length);}
    }

    public DynamicArray() {
        massiv = new Object[defaltSize];
        size = 0;
    }


    public void add(T elem){
        if (size  == massiv.length){
            massiv = Arrays.copyOf(massiv, massiv.length*2);}
        massiv[size] = elem;
        size++;}

    public void delete(T elem){
        for (int i = 0; i < size; i++){
            if (elem.equals(massiv[i])){
                if (size - 1 - i >= 0) {
                    System.arraycopy(massiv, i + 1, massiv, i, size - 1 - i);}
                massiv[size - 1] = null;
                size--;
                if (size < massiv.length / 2){
                    massiv = Arrays.copyOf(massiv, massiv.length/2);
                }
                return;}}}

    public void putAt(int index, T elem){
        if (index >= size) throw new IndexOutOfBoundsException("Недопустимый индекс.");
        massiv[index] = elem;
    }

    public T elemAt(int index) throws IndexOutOfBoundsException{
        if (index >= size) throw new IndexOutOfBoundsException("Недопустимый индекс.");
        return (T) massiv[index];
    }

    public boolean full(){
        return (size == massiv.length);
    }

    public int length(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(massiv, size));
    }

    public Iterator<T> iterator(){
        return new DynamicArrayIterator<>(this);
    }
}


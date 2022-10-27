package t2_1;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arrayList.add(i);}
        Iterator<Object> iterator = arrayList.iterator();
        IteratorAdapter iteratorAdapter = new IteratorAdapter(iterator);
        while (iteratorAdapter.hasMoreElements()){
            System.out.println(iteratorAdapter.nextElement());
        }
    }
}

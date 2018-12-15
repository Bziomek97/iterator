import Iterator.IntIterator;
import Iterator.Iterator;
import IteratorMaker.IteratorMaker;
import IteratorMaker.Maker;
import Sort.HeapSort;
import Sort.QuickSort;

import java.util.List;

public class Main {

    public static void main(String[] args){
        IteratorMaker iter= new Maker();

        Context context = new Context(new QuickSort());

        System.out.println("QuickSort:");
        for(int[] i: context.iterator(iter.iterator())){
            System.out.print("[");
            int k=0;
            for(int j: i) {
                System.out.print(j);
                if (k!=9) System.out.print(",");
                k++;
            }
            System.out.println("]");
        }

        IteratorMaker iter2= new Maker();

        Context context2 = new Context(new HeapSort());

        System.out.println("\nHeapSort:");
        for(int[] i: context2.iterator(iter2.iterator())){
            System.out.print("[");
            int k=0;
            for(int j: i) {
                System.out.print(j);
                if (k!=9) System.out.print(",");
                k++;
            }
            System.out.println("]");
        }
    }

}

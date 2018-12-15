import Iterator.*;
import Sort.Sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Context {

    private Sort currSort;

    public Context(Sort currSort) {
        this.currSort = currSort;
    }

    public Sort getCurrSort() {
        return currSort;
    }

    public List<int[]> iterator(Iterator iterator){
        List<int[]> tmp= new LinkedList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();

        while(iterator.hasNext()){
            for(int i: iterator.next()){
                temp.add(i);
            }
            currSort.sort(temp);

            int[] helper = new int[10];
            for(int i=0; i<10;i++){
                helper[i]=temp.get(i);
            }

            if (tmp != null) {
                tmp.add(helper);
            }
        }
        return tmp;
    }

}

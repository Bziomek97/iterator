package Sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HeapSort implements Sort {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> obj) {
        for(int i=obj.size()/2-1; i>=0; i--)
            this.heapify(obj,obj.size(),i);

        for(int i=obj.size()-1; i>0; i--){
            int tmp = obj.get(0);
            obj.set(0,obj.get(i));
            obj.set(i,tmp);

            heapify(obj,i,0);
        }
        return obj;
    }

    public void heapify(ArrayList<Integer> obj,int size, int i){
        int largest,left,right;
        largest= i;
        left = 2*i+1;
        right = 2*i+2;

        if (left < size && obj.get(left) > obj.get(largest)) largest = left;

        if (right < size && obj.get(right) > obj.get(largest)) largest = right;

        if(largest != i){
            int swap = obj.get(i);
            obj.set(i,obj.get(largest));
            obj.set(largest,swap);

            heapify(obj,size,largest);
        }

    }

}

package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort implements Sort {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> obj) {
        Collections.sort(obj);
        return obj;
    }
}

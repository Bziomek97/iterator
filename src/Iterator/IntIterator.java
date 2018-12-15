package Iterator;

import java.util.LinkedList;
import java.util.List;

public class IntIterator implements Iterator{

    private List<int[]> digits;
    private int currElement=0;

    public IntIterator(List<int[]> digits) {
        this.digits=digits;
    }

    @Override
    public boolean hasNext() {
       if(this.currElement >= digits.size() || digits.get(currElement) == null) return false;
       return true;
    }

    @Override
    public int[] next() {
        if(this.digits.get(currElement)==null) this.currElement=0;
        int[] tmp;
        if(hasNext()) tmp=this.digits.get(this.currElement);
        else tmp=null;
        this.currElement++;
        return tmp;
    }
}

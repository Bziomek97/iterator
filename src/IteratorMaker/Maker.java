package IteratorMaker;

import Iterator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Maker implements IteratorMaker {

    @Override
    public Iterator iterator(){
        Random generator = new Random();

        List<int[]> tmp = new ArrayList<>();

        for(int i=0;i<10;i++){
            int[] temp=new int[10];
            for(int j=0;j<10;j++){
                temp[j]=generator.nextInt(100);
            }
            tmp.add(temp);
        }

        return new IntIterator(tmp);
    }
}

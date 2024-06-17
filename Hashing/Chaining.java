// package Hashing;
import java.util.*;

class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<b; i++){
            table.add(new LinkedList<Integer>()); 
        }
    }
    void insert(int key){
        int i=key%BUCKET;
        table.get(i).add( key);
    }
    void remove(int key){
        int i=key%BUCKET;
        table.get(i).remove((Integer)key);
    }
    boolean search(int key){
        int i=key%BUCKET;
        return table.get(i).contains(key);
    }
}
public class Chaining{
    public static void main(String[] args) {
        MyHash mh=new MyHash(7);
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        // System.out.println(mh);
        System.out.println(mh.search(10));
        mh.remove(15);
        System.out.println(mh.search(15));
    }
}

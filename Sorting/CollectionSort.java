// package SortingGFG;
import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
         
        System.out.println(list);
    }
}

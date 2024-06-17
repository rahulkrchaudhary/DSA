
import java.util.*;

public class InsertionSort {
    //T.C=O(n^2)
    // In-place and stable
    // A.S=O(1)
    //used in pratice for small size array(TimSort and IntraSort)
    //best case-O(n)
    static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={10, 8,20, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

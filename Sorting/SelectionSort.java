
import java.util.Arrays;

public class SelectionSort {
    // not stable
    static void naive_selectionSort(int arr[]){
        int n = arr.length;
        int temp[]= new int[n];
        for(int i=0; i<n; i++){
            int min_index=0;
            for(int j=1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
                
            }
            temp[i]=arr[min_index];
            arr[min_index]=Integer.MAX_VALUE;
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
    }
    //In place implementation
    //not stable
    // T.C=theta(n^2)
    //(n-1)+(n-2)+.......+2+1 = (n*(n-1)/2)
    static void effective_bubbleSort(int arr[]){
        int n = arr.length;
        int min_index=0;
        for(int i=0; i<n-1; i++){
            min_index=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[min_index];
                    arr[min_index]=temp;
                     
                }
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={10, 8,20, 5};
        // naive_selectionSort(arr);
        effective_bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


import java.util.Arrays;

public class BubbleSort {
    // n-1 passes
    // T.C=theta(n^2)
    //(n-1)+(n-2)+.......+2+1 = (n*(n-1)/2)
    static void bubbleSort(int arr[]){
        int n = arr.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void effective_bubbleSort(int arr[]){
        //stable sorting alogrithm
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            // swapped variable enchances the performance for sorted array
            // T.C=linear for sorted array
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
       int arr[]={10, 8,20, 5};
       bubbleSort(arr);
       System.out.println(Arrays.toString(arr)); 
    }
}

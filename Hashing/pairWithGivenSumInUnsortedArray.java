
import java.util.*;

public class pairWithGivenSumInUnsortedArray{
    //T.C=O(n^2)
    //A.S=O(1)
    static boolean naive_isSum(int arr[], int sum){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==sum)
                    return true;
            }
        }
        return false;
    }
    //method 2--sort thr array and use two pointer approach
    // two pointer approach
    //T.C=O(nlog(n))
    //A.S=O(1)
    static boolean isPair(int arr[], int sum){
        int n=arr.length;
        Arrays.sort(arr);
        int start=0, end=n-1;
        while(start<end){
            if(arr[start]+arr[end]==sum){
                return true;
            }else if(arr[start]+arr[end]>sum){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
    // method 3--hashing
    //T.C=O(n)
    //A.S=O(n)
    static boolean efficient_isPair(int arr[], int sum){
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(sum-x)){
                return true;
            }
            else{
                set.add(x);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={3,2,8,15,-8};
        int sum=17;
        //o/p=true
        int arr1[]={2,1,6,3};
        int sum1=6;
        //o/p=false
        System.out.println(naive_isSum(arr, sum));
        System.out.println(efficient_isPair(arr, sum));
        System.out.println(isPair(arr, sum));
        System.out.println(isPair(arr1, sum1));

    }
}
import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {
    //naive soln
    //T.C=O(n^2)
    //A.S=O(1)
    static int naive_countDist(int arr[]){
        int n=arr.length;
        int res=0;
        for(int i=0; i<n; i++){
            boolean flag=false;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                res++;
            }
        }
        return res;
    }
    //efficient solution
    //T.C=theta(n);
    //A.S=O(n);
    static int efficient_countDist(int arr[]){
        int n=arr.length;
        int res=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    //improved efficient soln
    static int count(Integer arr[]){
        HashSet<Integer> s=new HashSet<>(Arrays.asList(arr));
        return s.size();
    }
    public static void main(String[] args) {
        int arr[]={10,10,10,10};
        int arr1[]={10,12,11,14,11,15,10,15};
        int arr2[]={10, 11, 12,13};
        Integer arr3[]={10, 11, 12,13};
        System.out.println(efficient_countDist(arr));
        System.out.println(efficient_countDist(arr1));
        System.out.println(efficient_countDist(arr2));
        System.out.println(naive_countDist(arr));
        System.out.println(naive_countDist(arr1));
        System.out.println(naive_countDist(arr2));
        System.out.println(count(arr3));
    }
}

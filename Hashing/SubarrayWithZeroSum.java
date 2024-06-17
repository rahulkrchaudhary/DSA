
import java.util.HashSet;

public class SubarrayWithZeroSum {
    //naive soln
    //T.C=O(n^2)
    static boolean naive_is0Subarray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int curr_sum=0;
            for(int j=i; j<n; j++){
                curr_sum+=arr[j];
                if(curr_sum==0){
                    return true;
                }
            }
        }
        return false;
    }
    //efficient soln
    //prefix sum and hashing
    // //T.C=O(n)
    static boolean efficient_is0Subarray(int arr[]){
        HashSet<Integer> h=new HashSet<>();
        int n=arr.length;
        int prefix_sum=0;
        h.add(0);
        for (int i = 0; i < n; i++) {
            prefix_sum+=arr[i];
            if(h.contains(prefix_sum)){
                return true;
            }
            h.add(prefix_sum); 
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,4,13,-3,-10,5};
        int b[]={-1,4,-3,5,1};
        int c[]={3,1,-2,5,6};
        int d[]={5,6,0,8};
        System.out.println(naive_is0Subarray(a));
        System.out.println(naive_is0Subarray(c));
        System.out.println(efficient_is0Subarray(a));
        System.out.println(efficient_is0Subarray(c));
    }
}

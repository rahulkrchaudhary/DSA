
import java.util.HashSet;

public class SubarrayWithGivenSum {
    //naive soln
    //T.C=O(n^2)
    //A.S=O(1)
    static boolean naive_isSum(int a[], int sum){
        int n=a.length;
        for(int i=0; i<n; i++){
            int curr_sum=0;
            for(int j=i; j<n; j++){
                curr_sum+=a[j];
                if(curr_sum==sum){
                    return true;
                }
                
            }
        }
        return false;
    } 
    //efficient solution
    //prefix sum amd hashing
    //T.C=O(n)
    //A.S=O(n)
    static boolean efficient_isSum(int a[], int sum){
        HashSet<Integer> h=new HashSet<>();
        int n=a.length;
        int prefix_sum=0;
         for(int i=0; i<n; i++){
            prefix_sum+=a[i];
            if(prefix_sum==sum){
                return true;
            }
            if(h.contains(prefix_sum-sum)){
                return true;
            }
            h.add(prefix_sum);
            
         }
         return false;
    }
    public static void main(String[] args) {
        int a[]={5,8,6,13,3,-1};
        int sum=22;
        int b[]={15,2,8,10,-5,-8,6};
        int sum1=3;
        int c[]={3,2,5,6};
        int sum2=10;
        System.out.println(naive_isSum(a, sum));
        System.out.println(naive_isSum(b, sum1));
        System.out.println(naive_isSum(c, sum2));
        System.out.println(efficient_isSum(a, sum));
        System.out.println(efficient_isSum(b, sum1));
        System.out.println(efficient_isSum(c, sum2));
        
    }
}

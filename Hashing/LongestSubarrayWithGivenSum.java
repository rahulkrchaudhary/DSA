import java.util.*;

public class LongestSubarrayWithGivenSum {
    //naive soln
    //T.C=O(n^2)
    static int naive_lenhthOfSubarray(int a[], int sum){
        int n=a.length;
        int res=0;
        for(int i=0; i<n; i++){
            int curr_sum=0;
            for(int j=i; j<n; j++){
                curr_sum+=a[i];
                if(curr_sum==sum){
                    res=Math.max(res, (j-i+1));
                }
            }
        }
        return res;
    }
    //efficient solution
    //T.C=O(n);
    static int lengthOfSubarray(int a[], int sum){
        int n=a.length;
        Map<Integer,Integer> m=new HashMap<>();
        int prefixSum=0,res=0;
        for(int i=0; i<n; i++){
            prefixSum+=a[i];
            if(prefixSum==sum){
                res=i+1;
            }
            if(m.containsKey(prefixSum)==false){
                m.put(prefixSum, i);
            }
            if(m.containsKey(prefixSum-sum)==true){
                res=Math.max(res,i-m.get(prefixSum-sum));
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int a[]={5,8,-4,-4,9,-2,2};
        int sum=0;
        int b[]={3,1,0,1,8,2,3,6};
        int sum1=5;
        int c[]={8,3,7};
        int sum2=15;
        int d[]={5,2,3};
        int sum3=5;
        System.out.println(naive_lenhthOfSubarray(d, sum3));
        System.out.println(lengthOfSubarray(d, sum3));
    }
}

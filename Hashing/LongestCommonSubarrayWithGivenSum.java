import java.util.HashMap;

public class LongestCommonSubarrayWithGivenSum {
    //naive solution
    //T.C=O(n^2);
    //A.S=O(1);
    static int naive_maxCommon(int arr1[], int arr2[]){
        int n=arr1.length;
        int res=0;
        for(int i=0; i<n; i++){
            int sum1=0, sum2=0;
            for(int j=i; j<n; j++){
                sum1+=arr1[j];
                sum2+=arr2[j];
                if(sum1==sum2){
                    res=Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    //efficent solution
    //T.C=O(n);
    //A.S=O(n);
    //hint--the problem is going to reduce into the problem
    //of longest subarray with zero sum int an array

    //steps to solve
    //1. compute a difference array in temp array
    //2. return length of the largest subarray with zero sum in temp

    static int efficent_maxCommon(int arr1[], int arr2[]){
        int n=arr1.length;
        int temp[]=new int[n];
        for(int i=0; i<n; i++){
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer, Integer> m=new HashMap<>();
        int prefix_sum=0,res=0;
        for(int i=0; i<n; i++){
            prefix_sum+=temp[i];
            if(prefix_sum==0){
                res=i+1;
            }
            if(m.containsKey(prefix_sum)){
                res=Math.max(res, i-m.get(prefix_sum));
            }else{
                m.put(prefix_sum, i);
            }
                
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={0,1,0,0,0,0};
        int a1[]={1,0,1,0,0,1};
        int b[]={0,1,0,1,1,1};
        int b1[]={1,1,1,1,1,0,1};
        int c[]={0,0,0};
        int c1[]={1,1,1};
        System.out.println(naive_maxCommon(a, a1));
        System.out.println(naive_maxCommon(b,b1));
        System.out.println(naive_maxCommon(c, c1));
        System.out.println("efficent");
        System.out.println(efficent_maxCommon(a, a1));
        System.out.println(efficent_maxCommon(b, b1));
        System.out.println(efficent_maxCommon(c, c1));

    }
}

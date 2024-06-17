import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithEqualZerosAndOnes {
    //naive solution
    //T.C=O(n^2)
    public static int naive_longestSub(int arr[]) {
        int n=arr.length;
        int res=0;
        for(int i=0; i<n; i++){
            int count0=0, count1=0;
            for(int j=i; j<n; j++){
                if(arr[j]==0){
                    count0++;
                }else {
                    count1++;
                }
                if(count0==count1){
                    res=Math.max(res, count0+count1);//j-i+1
                }
            }

        }
        return res;
    }
    // efficient solution by gfg

    // step
    //1.->replace every 0 with -1
    //2.-> now call the function to 
    //find length of the longest subarray with 0 sum
    static int efficient_longestSub(int arr[]){
        int n=arr.length;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
         arr[i] = (arr[i] == 0) ? -1 : 1;
         
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
             maxLen = i+1;
             
            if(hm.containsKey(sum+n) == true)
            {
                if(maxLen < i - hm.get(sum + n))
                 maxLen = i - hm.get(sum + n);
                
            }else hm.put(sum+n, i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int a[]={1,0,1,1,1,0,0};
        int b[]={1,1,1,1};
        int c[]={0,0,1,1,1,1,1,0};
        int d[]={0,0,1,0,1,1};
        int e[]={1,1,1,0,1,0};
        System.out.println(naive_longestSub(a));
        System.out.println(naive_longestSub(b));
        System.out.println(naive_longestSub(c));
        System.out.println(naive_longestSub(d));
        System.out.println(naive_longestSub(e));
        System.out.println("hiiiii");
        System.out.println(efficient_longestSub(a));
        System.out.println(efficient_longestSub(b));
        System.out.println(efficient_longestSub(c));
        System.out.println(efficient_longestSub(d));
        System.out.println(efficient_longestSub(e));



    }
    
}

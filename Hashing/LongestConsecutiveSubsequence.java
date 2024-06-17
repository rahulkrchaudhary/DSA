
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    //we need to find the longest subsequence in the form
    //of x, x+1, x+2.....x+i with these elements appearing in any order
    //in the given array
    //naive soln
    //T.C=O(nlog(n))
    static int naive_longestsubsequemce(int arr[]){
        int n=arr.length;
        // int res=0;
        // Arrays.sort(arr);
        // for(int i=0; i<n; i++){
        //     int max_len=1;
        //     for(int j=i; j<n-1; j++){
        //         if(arr[j]+1==arr[j+1]){
        //             max_len++;
        //         }
        //     }
        //     res=Math.max(res, max_len);
        // }
        // return res;
        Arrays.sort(arr);
        int res=1, curr=1;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]+1){
                curr++;
            }else if(arr[i]!=arr[i-1]){
                res=Math.max(res, curr);
                curr=1;
            }
        }
        return Math.max(res,curr);
    }
    //efficent soln
    //T.C=O(n)
    //A.S=O(n)

    // **Hint**
    //1. we first insert all elements in a hash table
    //2. then with 2n lookups we find the result
    // number of lookups is twice the size of hash table
    static int efficent_maxCommon(int arr[]){
        HashSet<Integer> s=new HashSet<>();
        for(int x:arr){
            s.add(x);
        }
        int res=0;
        for(Integer x: s){
            if(s.contains(x-1)==false){
                int curr=1;
                while(s.contains(x+curr)){
                    curr++;
                }
                res=Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,9,3,4,2,20};
        int b[]={8,20,7,30};
        int c[]={20,30,40};
        System.out.println(naive_longestsubsequemce(a));
        System.out.println(naive_longestsubsequemce(b));
        System.out.println(naive_longestsubsequemce(c));
        System.out.println("efficent solution");
        System.out.println(efficent_maxCommon(a));
        System.out.println(efficent_maxCommon(b));
        System.out.println(efficent_maxCommon(c));
    }
}

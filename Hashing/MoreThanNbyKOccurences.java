
import java.util.*;

public class MoreThanNbyKOccurences {
    //naive solution
    //T.C=O(nlog(n))
    static void naive_printNbyK(int arr[], int k){
        int n=arr.length;
        Arrays.sort(arr);
        int i=1, count=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                count++;
                i++;
            }
            if(count>n/k){
                System.out.println(arr[i-1]);
            }
            count=1;
            i++;
        }

    } 
    //efficient soln
    //T.C=theta(n)
    static void efficent_printNbyK(int arr[], int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int x: arr){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>arr.length/k){
                System.out.println(e.getKey());
            }
        }
    }
    //when n is very very large and k is very small
    //T.C=O(n*k)
    
    public static void main(String[] args) {
        int a[]={30,10,20,20,10,20,30,30};
        int k=4;
        naive_printNbyK(a, k);
    }
}

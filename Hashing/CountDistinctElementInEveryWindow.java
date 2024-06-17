import java.util.*;
public class CountDistinctElementInEveryWindow {
    // number of window=n-k+1
    
    //naive solution
    //T.C=O((n-k)*k*k)
    static void naive_printDistinct(int arr[],int k){
        int n=arr.length;
        for(int i=0; i<=n-k; i++){
            int count=0;
            for(int j=0; j<k; j++){
                boolean flag=false;
                for(int p=0; p<j; p++){
                    if(arr[i+j]==arr[i+p]){
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    //efficient solution
    // step--
    //1.create a frequency map of first k items
    //2.print the size of frequency map
    // 3. for(i=k to n)
       // a.-decrease the frequency of arr[i-k]
       // b. if the frequency of arr[i-k] becomes zero, remove it from the map
       // c. if arr[i] does not exist in the map , insert it else increase the frequency in the map
       // d. print the size of the map
    //T.C=O(n)
    static void efficient_printDistinct(int arr[],int k){
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map.size());
        for(int i=k; i<n; i++){
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.println(map.size());
        }
        
    }
    public static void main(String[] args) {
        int a[]={10,20,20,10,30,40,10};
        int k=4;
        int b[]={10,10,10,10};
        int k1=3;
        int c[]={10,20,30,40};
        int k2=3;
        naive_printDistinct(a, k);
        naive_printDistinct(b, k1);
        naive_printDistinct(c, k2);
        efficient_printDistinct(a, k);
        efficient_printDistinct(b, k1);
        efficient_printDistinct(c, k2);
    }
}

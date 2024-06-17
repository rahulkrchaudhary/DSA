import java.util.*;

public class FrequencyOfArrayElement {
    //naive solution
    static void naive_countElement(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            boolean flag=false;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                continue;
            }
            int freq=1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
    //efficient solution
    static void efficient_count(int arr[]){
        int n=arr.length;
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0; i<n; i++){
            h.put(arr[i],h.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer>e : h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={10,12,10,15,10,20,12,12};
        naive_countElement(arr);
        System.out.println("hashmap");
        efficient_count(arr);
    }
}

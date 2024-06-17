import java.util.*;

public class UnionOfTwoUnsortedArray {
    
    static int naive_Union(int a[], int b[]){
        int m=a.length;
        int n=b.length;
        int[] dist=new int[m+n];
        int res=0;
        for(int i=0; i<m; i++){
            boolean flag=false;
            for(int j=0; j<dist.length; j++){
                if(a[i]==dist[j]){
                    flag=true;
                }
            }
            if(flag==false){
                dist[res]=a[i];
                res++;
            }
        }
        for(int i=0; i<n; i++){
            boolean flag=false;
            for(int j=0; j<dist.length; j++){
                if(b[i]==dist[j]){
                    flag=true;
                }
            }
            if(flag==false){
                dist[res]=b[i];
                res++;
            }
        }
        return dist.length;
    }
    static int efficient_Union(int a[], int b[]){
        int m=a.length;
        int n=b.length;
        HashSet<Integer> s=new HashSet<>();
        // for(int i=0; i<m; i++){
        //     s.add(a[i]);
        // }
        for(int x:a){
            s.add(x);
        }
        // for(int i=0; i<n; i++){
        //     s.add(b[i]);
        // }
        for(int x:b){
            s.add(x);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int a[]={15,10,5,20};
        int b[]={15,15,20,10};
        System.out.println(efficient_Union(a, b));
        System.out.println(naive_Union(a, b));
    }
}


import java.util.ArrayList;

public class InsertionOfTwoSortedArray {
    // naive solution
    // T.C=O(n*m)
    //sorted or unsorted array
    static void insertion(int a[], int b[]){
        int m=a.length;
        int n=b.length;
        for(int i=0; i<m; i++){
            if(i>0 && a[i]==a[i-1])
                continue;
            for(int j=0; j<n; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
    //my solution
    //T.C=O(max(m,n))
    //A.S=O(n)
    //sorted array
    static ArrayList<Integer> insertedArray(int a[], int b[]){
        int i=0, j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if(i>0 && a[i]!=a[i-1]){
                    list.add(a[i]);
                    
                }
                i++;
                j++;
            } else if(a[i]<b[j]){
                i++;
            } else if(a[i]>b[j]){
                j++;
            }
        }
        return list;
    }
    //efficient solution
    //T.C=O(m+n)
    //A.S=O(1)
    // sorted array and unsorted array
    static void InsertArray(int a[], int b[]){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            } else if(a[i]>b[j]){
                j++;
            } else {
                System.out.print(a[i]);
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={3,5,10,10,10,15,15,20};
        int b[]={5,10,10,15,30};
        int a1[]={3,5,10,15,20};
        int b1[]={5,10,15,30};
        System.out.println(insertedArray(a, b));
        System.out.println(insertedArray(a1,b1));
        InsertArray(a, b);
    }
}

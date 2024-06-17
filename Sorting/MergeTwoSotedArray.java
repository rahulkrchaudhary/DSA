import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSotedArray {
    // naive solution
    // T.C=theta(m+n)
    static ArrayList<Integer> mergeArray(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else{
                list.add(arr2[j]);
                j++;
            }
        }
        if(i!=n1){
            while(i<n1){
                list.add(arr1[i]);
                i++;
            }
        }else{
            while(j<n2){
                list.add(arr2[j]);
                j++;
            }
        }
        return list;

    }
    //naive solution
    //T.C=O(((m+n)*(log(m+n)))
    //A.S=theta(m+n)
    static void merge_m_2(int a[], int b[]){
        int n1=a.length;
        int n2=b.length;
        int c[]=new int[n1+n2];
        for(int i=0; i<n1; i++){
            c[i]=a[i];
        }
        for(int i=0; i<n2; i++){
            c[n1+i]=b[i];
        }
        Arrays.sort(c);
        for(int i=0; i<n1+n2; i++){
            System.out.print(c[i]+" ");
        }

    }
    // efficient solution
    //T.C=theta(m+n)
    static void merge(int a[], int b[]){
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<n1){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<n2){
            System.out.print(b[j]+" ");
            j++;
        }
    }
    public static void main(String[] args) {
        int a[]={10,15,20,20};
        int b[]={1,12};
        System.out.println(mergeArray(a, b));
        merge_m_2(a, b);
        System.out.println();
        merge(a, b);
    }
}

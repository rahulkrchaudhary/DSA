
import java.util.Arrays;

public class UnionOfSortedArray {
    //naive solution
    //T.C=O((m+n)*log(m+n))
    //A.S=O(m+n)
    static void printUnion(int a[], int b[]){
        int m=a.length;
        int n=b.length;
        int c[]=new int[m+n];
        for(int i=0; i<m; i++){
            c[i]=a[i];
        }
        for(int i=0; i<n; i++){
            c[m+i]=a[i];
        }
        Arrays.sort(c);
        for(int i=0; i<(m+n); i++){
            if(i==0 || c[i]!=c[i-1]){
                System.out.print(c[i]+" ");
            }
        }
    }
    //efficient solution
    //T.C=O(m+n)
    //A.S=O(1)
    static void Union(int a[], int b[]){
        int m=a.length;
        int n=b.length;
        int i=0, j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.println(a[i]);
                i++;
            }else if(a[i]>b[j]){
                System.out.println(b[j]);
                j++;
            }else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            if(i>0 && a[i]!=a[i-1]){
                System.out.println(a[i]);
                i++;
            }
        }
        while(j<n){
            if(j>0 && b[j]!=b[j-1]){
                System.out.println(b[j]);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={2,3,3,3,4,4,5,6};
        int b[]={4,4};
        printUnion(a, b);
        System.out.println("Efficient solution");
        Union(a, b);

    }
}

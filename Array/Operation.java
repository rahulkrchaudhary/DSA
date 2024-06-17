// package ArrayGFG;

public class Operation {
    //search operation in unsorted array
    //T.C=O(n)
    //search in sorted is log(n) T.C
    static int Search(int arr[], int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    // Insert operation
    //T.C=O(n)
    static int Insert(int arr[], int n, int x, int cap, int pos){
        if(n==cap){
            return n;
        }
        int idx=pos-1;
        for(int i=n-1; i>=idx; i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return n+1;
    }
    // Insert at the end of dynamic sized array
    //T.C = O(1)
    

    //Deletion operation
    //T.C=theta(n)
    static int Deletion(int arr[], int n, int x){
        int i;
        for(i=0; i<n; i++){
            if(arr[i]==x){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=i; j<n-1; j++){
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=10;
        System.out.println(Search(arr, n));
    }
}

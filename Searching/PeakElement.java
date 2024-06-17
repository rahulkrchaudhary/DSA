

public class PeakElement {
    //naive sln
    // T.C=O(n)
    // S.C=O(1)
    static void naive_getPeak(int arr[], int n){
        if(n==1){
            System.out.println(arr[0]);
        }
        if(arr[0]>=arr[1])
            System.out.println(arr[0]);
        for(int i=1; i<n-1; i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        if(arr[n-1]>=arr[n-2])
            System.out.println(arr[n-1]);
    }
    static int efficient_getPeak(int arr[], int n){
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) &&
            (mid==n-1 || arr[mid+1]<=arr[mid])){
                return mid;
            }
            if(mid>0 && arr[mid-1]>=arr[mid])
                high = mid-1;
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,53,5,2,76,2,6,3,865,2};
        int n=arr.length;
        naive_getPeak(arr,n);
        System.out.println(efficient_getPeak(arr, n));
    }
}

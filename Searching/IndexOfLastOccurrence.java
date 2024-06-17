// package SearchingGFG;

public class IndexOfLastOccurrence {
    //naive soln
    static int naive(int arr[], int x){
        int n=arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    //efficient soln 
    static int recursive(int arr[], int low, int high, int x){
        int n=arr.length;
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(x>arr[mid]){
            return recursive(arr, mid+1, high, x);
        }else if(x<mid){
            return recursive(arr, low, mid-1, x);
        }else{
            if(mid==n-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }else{
                return recursive(arr, mid+1, high, x);
            }
        }
    }
    static int iterative(int arr[], int n, int x){
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x>arr[mid]){
                low=mid+1;
            } else if(x<arr[mid]){
                high=mid-1;
            }else{
                if(mid==n-1 || arr[mid+1]!=arr[mid]){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;

    }
   public static void main(String[] args) {
    int arr[]={10,20,30,40,50, 50, 50, 50,60,70};
    System.out.println(naive(arr, 50));
    System.out.println(recursive(arr, 0, arr.length-1, 50));

    System.out.println(iterative(arr, arr.length, 50));
   } 
}

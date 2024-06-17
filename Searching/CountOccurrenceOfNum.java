

public class CountOccurrenceOfNum extends IndexOf1stOccurrence {

    public CountOccurrenceOfNum() {
        super();
    }
    static int iterativelast(int arr[], int n, int x){
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
    
    static int naive(int arr[], int n, int x){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    static int countOcc(int arr[], int n, int x){
        int first=iterative(arr, n, x);
        if(first==-1){
            return 0;
        }else{
            return iterativelast(arr, n, x)-first+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50, 50, 50, 50,60,70};
        System.out.println(countOcc(arr, 10, 50));
        System.out.println(naive(arr, 10, 50));
    }
}

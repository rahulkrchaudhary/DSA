// package SearchingGFG;

public class BinarySearch {
    static int naiveSoln(int arr[], int x){
        for(int i=0; i < arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    static int BinarySearch(int arr[], int x){
        int high=(arr.length)-1;
        int low=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==x){
                return mid;
            }else if(x>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    static int recursiveBinarySearch(int arr[], int low, int high, int x){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }else if(arr[mid]>x){
            return recursiveBinarySearch(arr, low, mid+1, x);
        }else{
            return recursiveBinarySearch(arr, mid+1, high, x);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
         System.out.println(BinarySearch(arr, 40));
    }
    
}

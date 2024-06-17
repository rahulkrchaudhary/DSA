public class SearchInInfiniteSortedArray {
    //naive soln
    // T.C=O(position)
    static int naive_search(int arr[], int x){
        int i=0; 
        while (true) { 
           if(arr[i]==x)
                return i;
            if(arr[i]>x)
                return -1;
            i++;
        }
    }
    
    static int BinarySearch(int arr[], int x, int low , int high){
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
    //efficient solution
    //T.C=O(log(position))
    static int efficient_search(int arr[], int x){
        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x){
            return i;
        }
        return BinarySearch(arr, x, (i/2+1),i-1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50, 50, 50, 50,60,70};
       System.out.println(naive_search(arr, 60)); 
       System.out.println(efficient_search(arr, 60));
    }
}

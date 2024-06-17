

public class KthSmallestNum {
    //naive solution
    // static int kthNum(int arr, int n, int k){
    //    Arrays.sort(arr);
    //     return arr[k-1];
    // }
    // efficient solution
    // partition function
    static int partition(int arr[], int l, int h){
        int pivot = arr[h];
        int i=l-1;
        for(int j=l; j<=h-1; i++){
            if(arr[j]<pivot){
                i++;
                //swap(arr[i], arr[j]);
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    static int KthSmallestNum(int arr[], int n, int k){
        int l=0, h=n-1;
        while(l<=h){
            int p=partition(arr, l, h);
            if(p==k-1){
                return p;
            }else if(p<k-1){
                l=p+1;
            }else 
            //if(p>k-1)
            {
                h=p-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,5,30,12};
        int n=arr.length;
        int k=2;
        // System.out.println(kthNum(arr, n, k));
        System.out.println(KthSmallestNum(arr, n, k));
    }
}

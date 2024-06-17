public class HoaresPartition {
    static void partitoin(int arr[], int l, int h){
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do { 
                i++;
            } while (arr[i]<pivot);
            do{
                j--;
            } while(arr[j]>pivot);
            if(i>=j){
                // return j;
                System.out.println(j);
                break;
            }
            //swap(arr[i],arr[j])
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
    static  void partition_M_2(int arr[], int l, int h){
        int pivot=arr[l];
        int i=l, j=h;
        while(i<j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                //swap(arr[i],arr[j])
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } 
        }
    }
    public static void main(String[] args) {
        int arr[]={10,67,1,23,9,3,57}; 
        int arr1[]={5,3,8,4,2,7,1,10};
        int n=arr.length;
        // partitoin(arr,0,n-1);
        partition_M_2(arr, 0, n-1);
        // System.out.println(p);
        for(int j=0; j<=n-1; j++){
            System.out.print(arr [j]+" ");
        }
        
    }
    
}

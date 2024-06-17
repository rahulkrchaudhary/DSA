public class QuickSort {
    //using lomuto partition
    static int LomutoPartition(int arr[], int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j=l;j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                //swap(arr[i],arr[j])
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        //swap(arr[i+1],arr[h])
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;

    }
    static void qSort(int arr[], int l, int h){
        if (l < h) {
            int p=LomutoPartition(arr, l, h);
            qSort(arr, l, p-1);
            qSort(arr, p+1, h);
        }
    }

    //quick sort using hoares partition
    static int HoaresPartitoin(int arr[], int l, int h){
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
                return j;
                
            }
            //swap(arr[i],arr[j])
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
    static void HoaresSort(int arr[], int l, int h){
        if (l < h) {
            int p=HoaresPartitoin(arr, l, h);
            HoaresSort(arr, l, p);
            HoaresSort(arr, p+1, h);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        int n=arr.length;
        // qSort(arr, 0, n-1); 
        HoaresSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }
    }
}

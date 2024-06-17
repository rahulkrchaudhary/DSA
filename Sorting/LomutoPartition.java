public class LomutoPartition {
    static void Partition(int arr[], int l, int h){
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
        System.out.println(i+1);
        for(int j=l; j<=h; j++){
            System.out.print(arr[j]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int l = 0, h = arr.length - 1;
        Partition(arr, l, h);
    }
}

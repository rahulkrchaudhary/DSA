public class NaivePartition {
    static void partitoin(int arr[], int l, int h, int p){
        int temp[]=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p] && i!=p){
                temp[index]=arr[i];
                index++;
            }
        }
        temp[index++]=arr[p];
        for(int i=l; i<=h; i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l; i<=h; i++){
            arr[i]=temp[i-l];
        }
        // System.out.println(arr.toString());
        for(int i=l; i<=h; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("jsdf");
        int arr[]={1,4,2,9,3,24,21,35};
        int l=0,h=arr.length-1,p=3;
        partitoin(arr, l, h, p);

    }
}

public class MergeFunctionOfMergeSort {
    static void mergefunction(int a[], int low, int mid, int high){
        int n=a.length;
        int n1=mid-low+1;
        int n2=high-mid;
        //settiing up auxillary arrays
        int right[]=new int[n2];
        int left[]=new int[n1];
        for(int i=0; i<n1; i++){
            left[i]=a[low+i];
        }
        for(int i=0; i<n2; i++){
            right[i]=a[mid+i+1];
        }
        //standard merge sort logic
        int i=0, j=0, k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
                k++;
            }
            else{
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=right[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        
    }
}

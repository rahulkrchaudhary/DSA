// package ArrayGFG;

public class LargestElementIndex {
    //naive approach;
    //T.C=O(n);
    
    static int getLargest(int arr[], int n){
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return i;
            }
        }
        return -1;
    }
    // 
    public static void main(String[] args) {
        
    }
}

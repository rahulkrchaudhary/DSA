public class TriplateSumInArray {
    static boolean naive_isTriplate(int arr[], int n, int x){
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean isPair(int arr[], int n, int x, int low){
         int i=low;
         int j=n-1;
         while(i<j){
             
            if(arr[i]+arr[j]==x){
                return true;
            }else if(arr[i]+arr[j]>x){
                j--;
            }else{
                i++;
            }
         }
        return false;
    }
    static boolean efficient_isTriplate(int arr[], int n, int x){
        for(int i=0; i<n-2; i++){
            if(isPair(arr, n, x-arr[i] , i+1))
                return true;
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,5,10,15,18};
        System.out.println(naive_isTriplate(arr, arr.length, 33));
        System.out.println(efficient_isTriplate(arr, arr.length, 33 ));
    }
}

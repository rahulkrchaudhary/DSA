public class TwoPointerApproach {
    //naive solution
    //T.C=O(n^2)
    static boolean naive_isPair(int arr[], int n, int x){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum=arr[i]+arr[j];
                if(sum==x){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean efficent_isPair(int arr[], int n, int x){
         int sum=0;
         int i=0;
         int j=n-1;
         while(i<j){
            sum=arr[i]+arr[j];
            if(sum==x){
                return true;
            }else if(sum>x){
                j--;
            }else{
                i++;
            }
         }
        return false;
    }
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4,5,6,7,8,9};
        int n=9;
        System.out.println(naive_isPair(arr, n, 9));
        System.out.println(efficent_isPair(arr, n, 9));
    }
}

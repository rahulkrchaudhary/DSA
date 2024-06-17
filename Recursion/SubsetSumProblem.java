public class SubsetSumProblem {
    static int countSet(int arr[],int n, int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return countSet(arr, n-1, sum)+countSet(arr, n-1, sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=5;
        int n=5;
        System.out.println(countSet(arr, n, sum));
    }
}

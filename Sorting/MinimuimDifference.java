public class MinimuimDifference {
    static int difference(int[] arr, int n){
        int res = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1, 5, 3, 6, 9};
        int n=arr.length;
        System.out.println(difference(arr, n));
    }
}

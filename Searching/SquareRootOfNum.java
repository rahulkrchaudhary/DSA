public class SquareRootOfNum {
    //naive soln
    //T.C=theta(root(n))
    static int naive_sqrt(int n){
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    //efficient soln
    // T.C=theta(log(n))
    static int efficient_sqrt(int n){
        int low=1, high=n;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==n){
                return mid;
            } else if(mid*mid>n){
                 high=mid-1;
            } else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 17;
        System.out.println(naive_sqrt(num));
        System.out.println(efficient_sqrt(num));
    }
}

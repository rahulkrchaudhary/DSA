// package MathematicsGFG;

public class Factorial {
    // recursive method
    //TC=theta(n)
    //AS=theta(n)
    static int factorialM2(int n){
        if(n==0){
            return 1;
        }
        return n*factorialM2(n-1);
    } 
    // iterative method
    //TC=theta(n)
    //AS=O(1)
    static int factorialM1(int n){
        int res=1;
        for(int i=2; i<=n; i++){
            res=res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factorialM2(1));
    }
}

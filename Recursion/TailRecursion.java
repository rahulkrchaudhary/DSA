public class TailRecursion {
    //example of tail recursion
    static void fun(int n){
        //start
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1); //n=n-1 goto start;
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int Nthfibonacci(int n){
        if(n<=1){
            return n;
        }
        return Nthfibonacci(n-1)+Nthfibonacci(n-2);
    }
    public static void main(String[] args) {
        fun(5);
    }
}

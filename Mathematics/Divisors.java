public class Divisors {
    static void PrintDivisorsM1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0)
                System.out.println(i);
        }
    }
    static void PrintDivisorsM2(int n){
        int i;
        for(i=1; i*i<=n; i++){
            if(n%i==0)
                System.out.println(i);
        }
        for( ; i>=1; i--){
            if(n%i==0)
                System.out.println(n/i);
        }
    }
    public static void main(String[] args) {
         PrintDivisorsM1(10);
         PrintDivisorsM2(10);
    }
}

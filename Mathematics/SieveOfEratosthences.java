import java.util.Arrays;

public class SieveOfEratosthences {
    static void PrintPrime(int n){
        boolean isPrime[]=new boolean[n+1] ;
        Arrays.fill(isPrime, true);
        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for(int j=2*i; j<=n; j=j+i){
                    //replace 2*i with i*i
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }

    }
    static void PrintPrimeM1(int n){
        boolean isPrime[]=new boolean[n+1] ;
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i);
                for(int j=i*i; j<=n; j=j+i){
                    //replace 2*i with i*i
                    isPrime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        PrintPrime(23);
        PrintPrimeM1(23);
    }
}

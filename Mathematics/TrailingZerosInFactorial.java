public class TrailingZerosInFactorial {
    //navie solution
    static int CountofZero(int n){
        //TC=theta(n);
        //overflow
        int count=0;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        while(fact>0){
            if(fact%10==0){
                count++;
                fact=fact/10;
            }
        }
        return count;
    }
    // efficient solution
    // TC=theta(logn)
    static int CountofZeroM1(int n){
        int count=0;
        for(int i=5;i<=n;i=i*5){
            count=count+n/i;
        }
        return count;
    }
    public static void main(String[] args) {
         System.out.println(CountofZero(4));
    }
}

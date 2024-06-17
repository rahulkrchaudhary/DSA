public class SumOfDigit {
    static int NumOfDigit(int n){
        // TC=theta(d)
        if(n==0){
            return 0;
        // if(n<=9){
            // return n;
        // }
        }else{
            int digit=n%10;
            return digit + NumOfDigit(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(NumOfDigit(23456));
    }
}

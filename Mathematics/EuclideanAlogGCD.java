public class EuclideanAlogGCD {
    //navie solution
    static int gcdM1(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,b%a);
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(gcd(a, b));
        System.out.println(gcdM1(a, b));
    }
}

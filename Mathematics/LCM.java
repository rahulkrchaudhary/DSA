public class LCM {
    //naive solution
    //TC=O(a*b-max(a,b))
    static int lcm(int a, int b){
        int res=Math.max(a, b);
        while (true) { 
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    }
    // efficient solution
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
    static int lcdM2(int a, int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        int a=12, b=15;
        System.out.println(lcdM2(a, b));
    }
}

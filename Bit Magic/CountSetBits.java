// package Bit Magic GFG;

public class CountSetBits {
    //naive soln TC=theta(d)
    static int countSetM1(int n){
        int res=0;
        while(n>0){
            if((n&1)!=0){//(n%2==1)
                res++;
            }
            // res=res+(n&1);
            n=n/2;
            
        }
        return res;
    }
    static int BrainKerningamsAlgo(int n){
        int res=0;
        while(n>0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(countSetM1(40));
        System.out.println(BrainKerningamsAlgo(40));
    }
    
}

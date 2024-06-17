// package Bit Magic GFG;

public class Check_KthSet {
    // naive solution
    static void isSetM1(int n, int k){
        int x=1;
        for(int i=0; i<(k-1); i++){
            x=x*2;
            //n=n/2;
        }
        if((n&x)!=0){
        //if((n&1)!=0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    // efficient solution
    static void isSetM2(int n, int k){
        int x=(1<<(k-1));//2^k-1
         
        if((x&n)!=0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
    }
    static void isSetM3(int n, int k){
        int x=(n>>(k-1));//n/(2^k-1)
         
        if((x&1)!=0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
    }
    public static void main(String[] args) {
        int n=5;
        int k=13;
        isSetM1(n, k);
        isSetM2(n, k);

        isSetM3(n, k);
    }
    
}

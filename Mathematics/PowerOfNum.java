public class PowerOfNum {
    //naive solution
    static  int PowerM1(int x, int n){
        int res=1;
        for(int i=1; i<=n; i++){
            res=res*x;
        }
        return res;
    }
    static int PowerM2(int x, int n){
        if(n==0){
            return 1;
        }
        int temp=PowerM2(x, n/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;
        }
        else{
            return temp*x;
        }
    }
    static int PowerM3(int x, int n){
        int res=1;
        while(n>0){
            if(n%2!=0){
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(PowerM1(12, 3));
        System.out.println(PowerM2(12, 3));
        System.out.println(PowerM3(12, 3));
    }
}

// package MathematicsGFG;

public class PalindromeNum {
    //Idea:- 
    // traverse digit from right to left to find reverse og given number
    // time complexity=theta(d) where d is number of digit
    static boolean isPalindrome(int n){
        int revNum=0;
        int num=n;
        while(n>0){
            int digit=n%10;
            revNum=revNum*10+digit;
            n=n/10;
        }
        // if(revNum==num){
        //     return true;
        // }
        // return false;
        return (revNum==num);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
    }

}

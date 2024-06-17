public class Palindrome {
    // time compelixty=O(n)
    // space complexity=O(n)
    //T(n)=T(n-2)+theta(1)
    static boolean isPalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str="abcdcba";
        int n=str.length();
        System.out.println(isPalindrome(str, 0, n-1));
    }
}

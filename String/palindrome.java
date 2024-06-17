public class palindrome {
    static  String pal(String str){
        String ans="yes";
        int n=str.length()-1;
        int mid=n/2;
//        if(n%2!=0){
        for(int i=0; i<mid; i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                    ans="no";
            }
        }
        return ans;
    }
    static boolean ispal(String str){
//        StringBuilder rev=new StringBuilder(str);
//        rev.reverse();
//        return str.equals(rev.toString());
        int beg=0;
        int end=str.length()-1;
        while(beg<end){
            if(str.charAt(beg)!=str.charAt(end)){
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ispal("abba"));
    }
}

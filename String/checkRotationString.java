public class checkRotationString {
    static boolean areRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        // return ((s1+s1).contains(s2));
        return ((s1+s2).indexOf(s2)>=0);
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="bcdae";
        System.out.println(areRotation(s1, s2));
    }
    
}

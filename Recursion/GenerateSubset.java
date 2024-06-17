public class GenerateSubset {
    static void subSet(String s, String curr, int i){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        subSet(s, curr, i+1);
        subSet(s, curr+s.charAt(i), i+1);
    }
    public static void main(String[] args) {
        String name="rahul";
        subSet(name, "", 0);
    }
}

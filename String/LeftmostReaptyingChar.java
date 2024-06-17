public class LeftmostReaptyingChar {
    static final int CHAR=256;
    static int repeatingindex(String s1){
//        method 1-->naive solution
//      for(int j=0; j<s1.length(); j++) {
//          for (int i =j+1; i < s1.length(); i++) {
//              if (s1.charAt(j) == s1.charAt(i)) {
//                  return j;
//              }
//          }
//      }
//        return -1;
        int count[]=new int[CHAR];
        for(int i=0; i<s1.length();i++){
            count[s1.charAt(i)]++;
        }
        for(int i=0; i<s1.length();i++){
            if(count[s1.charAt(i)]>1)
                return i;
        }
        return -1;



    }
    public static void main(String[] args) {
        System.out.println(repeatingindex("abcdefgd"));
    }
}

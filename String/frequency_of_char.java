public class frequency_of_char {
    public static void main(String[] args) {
        String s = "greeksforgeeks";
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
//            we are using ASCII value of charAt(i) and a
//            the ASCII value of a=97 and A=65
//            index of char=ascii value of char-ascii value of a

        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
}

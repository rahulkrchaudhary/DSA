public class reverseWordinString {
    // methid--1
    static String reversingBySwapping(String s, int low, int high){
        char []ch=s.toCharArray();
        while(low<high){
             char temp=ch[low];
             ch[low]=ch[high];
             ch[high]=temp;
            low++;
            high--;
        }
        s=new String(ch);
        return s;
    }

    static String reverseWord(String s){
        int start=0;
        for(int end=0; end<s.length(); end++){
            if(s.charAt(end)==' '){
                s=reversingBySwapping(s, start, end-1);
                start=end+1;
            }
        }
        s=reversingBySwapping(s, start, s.length()-1);
        s=reversingBySwapping(s, 0, s.length()-1);
        return s;
    }
    public static void main(String[] args) {
        String str="welcome to geeksforgeeks";
        System.out.println(reverseWord(str));
        
    }
    
}

public class naivePatterenSearch {
    static void search(String txt, String pat){
        int m=txt.length();
        int n=pat.length();
        int ans=-1;
        for(int i=0; i<=m-n; i++){
            int j;
            for(j=0; j<n; j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==n){
                ans=i;
                // System.out.println(ans);
            }
        }
        System.out.println(ans);
  
    }
    // improved navie algorithim for distinct character in pattern
    static void search2(String txt, String pat){
        int m=txt.length();
        int n=pat.length();
        int ans=-1;
        for(int i=0; i<=m-n;){
            int j;
            for(j=0; j<n; j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==n){
                ans=i;
                // System.out.println(ans);
            }
            if(j==0){
                i++;
            }else{
                i=i+j;
            }
        }
        System.out.println(ans);
  
    }

    public static void main(String[] args) {
        String text="geeksforgeeks";
        String pattern="fr";
        String text1="abcefabghabcd";
        String pattern1="abcd";
        search(text, pattern);
        search(text1, pattern1);
        search2(text1, pattern1);
    }
    
}

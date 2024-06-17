public class subsequenceString {
    static boolean substring(String str, String x){
        //            int j=0;
        //            for(int i=0; i<str.length()&& j<x.length(); i++){
        //                if(x.charAt(j)==str.charAt(i)){
        //                    j++;
        //                }
        //            }
        //            return (j==x.length());
                int j=0;
                int y=0;
                for(int i=y; i<str.length(); i++){
                    if(j<x.length()){
                        if(x.charAt(j)==str.charAt(i)){
                            j++;
                            y=i+1;
                        }
                    }
                }
                return (j==x.length());
        
        
            }
            public static void main(String[] args) {
                System.out.println(substring("rahul", "agul"));
        
            }
}

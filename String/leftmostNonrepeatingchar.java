
public class leftmostNonrepeatingchar {
//     // nive solution
//     public static int leftmost_method_1(String s){
//         for(int i=0; i<s.length(); i++){
//             boolean flag=false;
//             for(int j=i+1; j<s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     flag = true;
//                     break;
//                 }
//             }
//             if (flag==false) {
//                 return i;
//             }
//         }
//         return -1;
//     }
    // method 2nd 
    static final int CHAR=256;
    public static int leftmost_method_2(String s){
        int []count=new int[CHAR];
        for(int i=0; i<s.length(); i++){

            count[s.charAt(i)]++;
            System.out.println(count[s.charAt(i)]);
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    // public static int leftmost_method_3(String s){
    //      int []firstindex = new int[CHAR];
    //      Arrays.fill(firstindex, -1);
    //      for(int i=0; i<s.length();i++){
    //         if(firstindex[s.charAt(i)]==-1){
    //             firstindex[s.charAt(i)]=i;
    //         }else{
    //             firstindex[s.charAt(i)]=-2;
    //         }
    //      }
    //      int res=Integer.MAX_VALUE;
    //      for(int i=0; i<CHAR; i++){
    //         if(firstindex[i]>0){
    //             res=Math.min(res,firstindex[i]);
    //         }
    //      }
    //      return (res==Integer.MAX_VALUE?-1:res);
    // }
    
    public static void main(String[] args) {
        String str="geeksforgeeks";
        // System.out.println(leftmost_method_1(str));
        System.out.println(leftmost_method_2(str));
        // System.out.println(leftmost_method_3(str));

    }
    
}

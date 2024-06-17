import java.util.HashSet;

public class IntersectionOfTwoUnsortedArray {
    //naive soln
    static void naive_Intersection(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0; i<n1; i++){
            boolean flag=false;
            for(int j=0; j<n2; j++){
                if(arr1[i]==arr2[j]){
                    // System.out.println(arr1[i]);
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr1[i]);
            }
        }
    }
    // efficient solution
    static void efficient_Intersection(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        HashSet<Integer>h=new HashSet<>();
        for(int i=0; i<n2; i++){
            h.add(arr2[i]);
        }
        for(int i=0; i<n1; i++){
            if(h.contains(arr1[i])){
                System.out.println(arr1[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={10,15,20,25,30,50};
        int arr2[]={30,5,15,80};
        naive_Intersection(arr1, arr2);
        efficient_Intersection(arr1, arr2);
    }
}

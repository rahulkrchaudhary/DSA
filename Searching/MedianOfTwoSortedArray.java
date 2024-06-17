import java.util.ArrayList;
import java.util.Arrays;

public class MedianOfTwoSortedArray {
    static int naive_findMedian(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n || j<m){
             if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
             }
             else{
                list.add(arr2[j]);
                j++;
             }
        }
        if(i==n-1){
            for(int k=j; k<m; k++){
                list.add(arr2[k]);
            }
        }else{
            for(int k=i; k<m; k++){
                list.add(arr1[k]);
            }
        }
        int size=list.size();
        int mid=size/2;
        if(size%2!=0){
            return list.get(mid);
        }else{
            return (list.get(mid)+list.get(mid-1))/2;
        }
    }
    static int naive_findMedian_M_2(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int arr[]=new int[n+m];
        int j=0;
        for(int i=0; i<n; i++){
            arr[j]=arr1[i];
            j++;
        }
        for(int i=0; i<m; i++){
            arr[j]=arr2[i];
            j++;
        }
         Arrays.sort(arr);
        int size=arr.length;
        int mid=size/2;
        if(size%2!=0){
            return arr[mid];
        }else{
            return (arr[mid]+arr[mid-1])/2;
        }
    }
    static double  efficient_findMedain(int arr1[], int arr2[]){
        double ans=0.0;
        int n1=arr1.length;
        int n2=arr2.length;
        int begin1=0, end1=n1;
        while(begin1<end1){
            int i1=(begin1+end1)/2;
            int i2=(n1+n2+1)/2-i1;
            int min1= (i1==n1)?Integer.MAX_VALUE:arr1[i1];
            int max1= (i1==0)?Integer.MIN_VALUE:arr1[i1-1];
            int min2=(i2==n2)?Integer.MAX_VALUE:arr2[i2];
            int max2=(i2==0)?Integer.MIN_VALUE:arr2[i2-1];
            if(max1<=min2 && max2<=min1){
                if((n1+n2)%2==0){
                    ans = (double)((Math.max(max1, max2)+Math.min(min1, min2)))/2;
                }else{
                    ans = (double)Math.max(max1, max2);
                }
            }else if(max1>min2){
                end1=i1-1;
            }else{
                begin1=i1+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a1[]={30,40,50,60};
        int a2[]={5,6,7,8,9};
        System.out.println(efficient_findMedain(a1, a2));
        System.out.println(naive_findMedian(a1, a2));
        System.out.println(naive_findMedian_M_2(a1, a2));
    }
}

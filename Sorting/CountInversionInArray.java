public class CountInversionInArray {
    //Inversion:- a pair (arr[i], arr[j]) forms an inversion when i<j and arr[i]>arr[j];
    //naive solution
    //time complexity:- O(n^2)
    //space complexity:- O(1)
    static int CountInversionInArray(int arr[]){
        int m=arr.length;
        int count=0;
        for(int i=0; i<m-1; i++){
            for(int j=i+1; j<m; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    //efficient solution
    static int countAndMerge(int arr[], int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1; i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2; i++){
            right[i]=arr[m+1+i];
        }
        int res=0, i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
                res=res+(n1-i);
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
    }
    static int countInversion(int arr[], int l, int r){
        int res=0;
        if(l<r){
            int m=l+(r-l)/2;
            res+=countInversion(arr, l, m);
            res+=countInversion(arr, m+1, r);

            res+=countAndMerge(arr, l, m, r);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={2,4,1,3,5};
        System.out.println(CountInversionInArray(a));
        int b[]={1,2,3,4,5};
        System.out.println(CountInversionInArray(b));
        int c[]={9,8,7,6,5};
        System.out.println(CountInversionInArray(c));
        System.out.println(countInversion(a, 0, 4));
        System.out.println(countInversion(b, 0, 4));
        System.out.println(countInversion(c, 0, 4));
    }
}

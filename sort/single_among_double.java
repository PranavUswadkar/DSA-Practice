package sort;

public class single_among_double {
    public static int find_single(int[] arr){
        int result=0;
        int lo = 0;
        int hi = arr.length-1;
        if(arr[lo] != arr[lo+1]) return arr[lo];
        if(arr[hi] != arr[hi-1]) return arr[hi];
        if(arr.length == 1) return arr[0];
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            int f=mid, s=mid;
            if(arr[mid] == arr[mid-1]){
                f=mid-1;
            }
            else{
                s=mid+1;
            }
            int leftCount = f-lo;
            int rightCount = hi-s;
            if(leftCount%2 == 0){
                lo=s+1;

            }
            else{
                hi=f-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        System.out.println(find_single(arr));
    }
}


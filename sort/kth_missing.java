package sort;

public class kth_missing{
    public static int find_kth_missing(int[] arr, int k){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int correct = mid + 1;
            int missing = arr[mid] - correct;
            if(missing >= k) hi = mid - 1;
            else lo = mid + 1;
        }
        return lo + k; // or hi + 1 + k;


    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(find_kth_missing(arr, k));
    }

}
package sort;

public class max_count {
    public static int find_max_count(int[] arr){
        int pos = 0;
        int neg = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > 0){
                pos++;
            }
            else{
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}

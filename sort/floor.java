package sort;

public class floor {
    public static int find_floor(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            
            if(arr[mid] <= target){
                left = mid+1;

            }
            else{
                right = mid - 1;
            }
        }
        return arr[right];//when left < right
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 10, 12, 14};
        int target = 4;
        System.out.println(find_floor(arr, target));
    }

}

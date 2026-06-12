package sort;

public class dec_binary {
    public static int binary_search(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                right = mid - 1;
                
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = { 99, 96, 92, 85, 83, 72, 60, 30};
        int target = 72;
        int result = binary_search(arr, target);
        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index: " + result);
        }
        
    }
}
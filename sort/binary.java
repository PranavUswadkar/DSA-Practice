package sort;

public class binary {
    public static int binary_search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                System.out.println("Found at index: " + mid);
                return mid;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = { 30, 60, 72, 83, 85, 92, 96, 99};
        int target = 42;
        int result = binary_search(arr, target);
        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index: " + result);
        }
        
    }
}

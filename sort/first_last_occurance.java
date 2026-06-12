package sort;

public class first_last_occurance {
    public static void first_occurance(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                result = mid;
                right = mid - 1;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("First occurrence at index: " + result);

    }
    public static void last_occurance(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                result = mid;
                left = mid + 1;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            
            }
            else{
                right = mid - 1;
            }

        }
        System.out.println("Last occurrence at index: " + result);
    }
    public static void main(String[] args){
        int[] arr = { 3,3,4,4,5,5,6,6,6,6,7,7};
        int target = 6;
        first_occurance(arr, target);
        last_occurance(arr, target);

    }
}

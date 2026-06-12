package Array;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");
        int[] arr = {10, 2, 5, 8, 9, 12};
        twosum(arr, 11);
    }

    public static boolean twosum(int arr[], int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                   
                    System.out.println("The target is formed");
                    return true;
                }
            }

            
        }
        System.out.println("Target is not formed!");
        return false;
        
    }
    
}

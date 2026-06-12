package Array;

public class second_max {
    public static void main(String[] args) {
        int[] arr = {4, 10, 10, 6, 3, 8};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("The Maximum Element is: "+max);
        System.out.println("The Second Maximum Element is: "+smax);
        
    }
}

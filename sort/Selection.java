package sort;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE, minindex =-1;
            for(int j=i; j<n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minindex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        print(arr);
    }
}

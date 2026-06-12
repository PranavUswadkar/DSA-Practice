package sort;
public class Insertion {
    public static void main(String[] args){
            int[] arr = {4, 1, 13, 7, 9, 2, 8, 8, 6};
            for(int i=1; i<arr.length; i++){
                int j=i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }
            for(int ele : arr) System.out.print(ele+" ");

    }
}
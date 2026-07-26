package Recurssion;

public class RecPrint {
    public static void recPrint(int[] arr, int idx){
        if(idx == arr.length)return;
        recPrint(arr, idx + 1);
        System.out.print(arr[idx]+ " ");
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr  = {1, 2, 3, 4, 5};
        recPrint(arr, 0);
        exists(arr, 0, 4);
    }
    public static void exists(int[] arr, int idx, int target){
        if(idx == arr.length) return;
        if(arr[idx] == target){
            System.out.println("Element " + target + " found at index: "+idx);
            return;

        }
        exists(arr, idx + 1, target);
    }
}

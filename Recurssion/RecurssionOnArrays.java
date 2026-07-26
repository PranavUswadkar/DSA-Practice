package Recurssion;

public class RecurssionOnArrays{

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};
        //recPrint(arr, 0);
        int ele = 76;
        System.out.print(exists(arr, ele, 0));
        
    }
    public static void recPrint(int[] arr, int idx){

        int n = arr.length;
        if(idx == n) return;
        recPrint(arr, idx+1);// reverse printing
        System.out.println(arr[idx]);


    }
    public static boolean exists(int[] arr, int target, int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return exists(arr, target, idx+1);


    }

}

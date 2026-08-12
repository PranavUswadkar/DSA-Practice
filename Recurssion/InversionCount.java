package Recurssion;

public class InversionCount {
    static int count;
    static int inversionCount(int[] arr){
        count = 0;
        mergeSort(arr);
        return count;
    }
    private static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; // 1 length array is pahele se sorted
        
        //Step 1: Create 2 new empty array of size n/2
        int[] a = new int[n/2]; int[] b = new int[n-n/2];

        //Step 2: Copy paste arr into a and b
        int idx = 0; // idx travel karna arr pe
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];

        //Step 3: Magic
        mergeSort(a);
        mergeSort(b);
        //Step 4: Merge 'a' and 'b' into arr
        merge(a, b, arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else {// a[i] > b[j];
                c[k++] = b[j++];
                count += a.length - i;
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 6, 2, 8, 9,1};
        int count = inversionCount(arr);
        System.out.println("Inversions = " + count);
        System.out.println("Sorted Array:");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
    
        }
    }
    
}

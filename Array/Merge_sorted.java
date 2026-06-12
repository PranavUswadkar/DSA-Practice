package Array;

public class Merge_sorted{
    public static void merge_sort(int[] a, int[] b, int[] c){

        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++]; 
            }
            else{
                c[k++] = b[j++]; 
            }
        }
            if(i == a.length){
                while(j<b.length){
                    c[k++] = b[j++];
                }
            }else{
                while(i<a.length){
                    c[k++] = a[i++];
                }
            }
        
    }
    public static void main(String[] args){
        int[] x = {3, 7, 9, 12};
        int[] y = {1, 3, 5, 6, 9, 10};
        int[] z = new int[x.length + y.length];

        for(int ele : z) System.out.print(ele+" ");
        System.out.println();
        merge_sort(x, y, z);
        for(int ele : z) System.out.print(ele+" ");
        System.out.println();

    }

}
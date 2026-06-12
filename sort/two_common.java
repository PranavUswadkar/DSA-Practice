package sort;
import java.util.ArrayList;
import java.util.Arrays;

public class two_common {
    public static ArrayList<Integer> commonElements(int a[], int b[]){
        int i=0, j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 5, 7, 9};
        System.out.println(commonElements(a, b));
    }
}

package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
public class AddOne {
    public static Vector<Integer> addOne(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int carry = 1;

        for(int i=n-1; i>=0; i--){
            if(arr[i]+ carry <= 9){
                ans.add(arr[i]+carry);
                carry = 0;
            }else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        return new Vector<>(ans);

    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 9};

        Vector<Integer> result = addOne(arr); // store result
        System.out.println(result); // print result
    }
}

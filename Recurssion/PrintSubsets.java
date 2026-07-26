package Recurssion;
import java.util.*;

public class PrintSubsets {
    private static void subsets(String ans, String s, int idx, List<String> list){
        if(idx == s.length()){
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch, s, idx+1, list);
        subsets(ans, s, idx+1, list);

    }
    public static void subsetSum(int[] arr, int idx, int sum, List<Integer> list){
        if(idx == arr.length){
            list.add(sum);
            return;
        }
        //Include current element
        subsetSum(arr, idx+1, sum+arr[idx], list);
        //Exclude current element
        subsetSum(arr, idx+1, sum, list);
    }

    
    public static void main(String[] argd){
        String s = "abc";
        List<String> list = new ArrayList<>();
        subsets("", s, 0, list);
        Collections.sort(list);
        System.out.println(list);

        int[] arr = {2, 3};
        List<Integer> list1 = new ArrayList<>();
        subsetSum(arr, 0, 0, list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}

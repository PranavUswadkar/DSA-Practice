package Array;

public class Segrigate_0_1{
    public static void segrigate0and1(int[] arr){
        int numberOfZeroes = 0;
        int numberOfOnes = 0;
        
        for(int ele : arr){
            if(ele == 0) numberOfZeroes++;
            else numberOfOnes++;
        }
        for(int i=0; i<numberOfZeroes; i++){
            arr[i] = 0;
        }
        for(int i=numberOfZeroes; i<arr.length; i++){
            arr[i] = 1;

        }
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1};
        
        segrigate0and1(arr);

        // print result
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}

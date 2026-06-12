package Array;

import java.util.Scanner;

public class Rotate_Array{

    public static void Rev(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    
    public static void Rotate(int[] arr, int d) { 
        
        int n = arr.length;

        d = d%n;

        Rev(arr, 0, d-1);
        Rev(arr, d, n-1);
        Rev(arr, 0, n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d: ");
        int d = sc.nextInt();


        Rotate(arr, d);

        System.out.println("Rotated Array: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}

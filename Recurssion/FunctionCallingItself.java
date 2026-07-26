package Recurssion;
import java.util.Scanner;

public class FunctionCallingItself {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        System.out.println();
        System.out.println(factorial(n));
        // printOneToN(1, n);
    }
    // public static void print(int n){
    //     if(n==0) return;
    //     System.out.print(n);
    //     print(n-1);
    // }
    public static void print(int n){
        if(n==0) return;
        
        print(n-1);
        System.out.print(n);
    }
    static int factorial(int n){
        if(n==0 || n==1)return 1;
        int ans = n*factorial(n-1);
        return ans;
    }
    // public static void printOneToN(int x, int n){
    //     if(x>n) return;
    //     System.out.print(x);
    //     printOneToN(x+1, n);
    // }
    
}

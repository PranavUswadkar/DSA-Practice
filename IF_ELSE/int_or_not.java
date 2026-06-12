package IF_ELSE;

import java.util.Scanner;

public class int_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = sc.nextDouble();

        int n = (int)x;
        if(x-n > 0){
            System.out.println("Not an Integer");

        }
        else{
            System.out.println("Integer");

        }
        sc.close();
        //sir method is worng as if 
        // x=-9.1
        // n=-9

        // x-n = -9.1 -(-9)
        // x-n = -0.1 < 0 but not an integer



        // if(x == (int)x){
        //     System.out.println("The number is Integer");

        // }
        // else{
        //     System.out.println("The number is not an Integer");

        // }
        // sc.close(); my way (working)
    }
    
}

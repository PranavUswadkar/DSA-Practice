package  Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        

        while(temp != 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reversed number: " + rev);
        
        while(n > 0){
            int d1 = n % 10;
            int d2 = rev % 10;

            System.out.print(d1 + d2);

            n /= 10;
            rev /= 10;
        }
        sc.close();

    }
}

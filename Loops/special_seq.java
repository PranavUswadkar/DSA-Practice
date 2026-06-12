package Loops;

import java.util.Scanner;

public class special_seq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms in sequence: ");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i);
            System.out.println(n);
            n--;
        }
        sc.close();
    }

    
}

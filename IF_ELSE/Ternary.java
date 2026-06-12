package IF_ELSE;

import java.util.Scanner;

public class Ternary {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int prason = (n>=0) ? 100 : 0;

        System.out.println(prason);

        sc.close();
    }
    
}

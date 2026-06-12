package IF_ELSE;

import java.util.Scanner;

public class Least_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Smallest of Three");
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int smallest;

        if(a < b){
            
            if(a < c){
                System.out.println("a is the smallest number");
                smallest = a;
            }
            else{
                System.out.println("c is the smallest number");
                smallest = c;
            }

        }
        else{
            if(b < c){
                System.out.println("b is the smallest number");
                smallest = b;

            }
            else{
                System.out.println("c is the smallest number");
                smallest = c;
            }
        }
        System.out.println("Smallest number is: " + smallest);
        sc.close();
    }
    
}

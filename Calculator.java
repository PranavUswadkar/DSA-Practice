import java.util.*;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        
        System.out.println("For Addition enter 1");
        System.out.println("For Substraction enter 2");
        System.out.println("For Multiplication enter 3");
        System.out.println("For Division enter 4");

        int choice = sc.nextInt();

        switch(choice){
            case 1: 
                System.out.println("Sum of a and b is: " + (a+b));
                break;
            case 2:
                System.out.println("Substraction of a and b is: " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication of a and b is: " + (a*b));
                break;
            case 4:
                if(b==0){
                    System.out.println("Division is not possible");
                    break;
                }else
                    System.out.println("The division is: "+ (a/b));
                    break;
            default:
                System.out.println("Invalid choice");

        }

        sc.close();
        
    }
}
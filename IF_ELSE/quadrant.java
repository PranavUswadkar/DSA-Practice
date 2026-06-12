package IF_ELSE;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = sc.nextInt();
        System.out.print("Enter y:");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("The Point lies in First Quadrant");
        }
        else if(x < 0 && y > 0){
            System.out.println("The Point lies in Second Quadrant");
        }
        else if(x < 0 && y < 0){
            System.out.println("The Point lies in Third Quadrant");
        }
        else if(x > 0 && y < 0){
            System.out.println("The Point lies in Fourth Quadrant");
        }
        else if(x == 0 && (y > 0 || y < 0)){
            System.out.println("the Point lies on Y_Axis");
        }
        else if(y == 0 && (x > 0 || x < 0)){
            System.out.println("The Point lies on X_Axis");
        }
        else{
            System.out.print("The Point lies on Origin");
        }
        sc.close();


    }
    
}

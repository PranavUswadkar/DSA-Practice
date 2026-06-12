package IF_ELSE;

import java.util.Scanner;

public class Area_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length: ");

        double Length = sc.nextDouble();

        System.out.print("Enter the Breadth: ");

        double Breadth = sc.nextDouble();

        double Area = Length * Breadth;
        System.out.println("Area is: "+ Area);
        double Perimeter = 2*(Length + Breadth);
        System.out.println("Perimeter is: "+ Perimeter);

        if(Area > Perimeter){
            System.out.print("Area is greater than Perimeter");
        }
        else{
            System.out.print("Perimeter is greater than Area");
        }
        sc.close();

    }
    
}

package IF_ELSE;

import java.util.Scanner;

public class div_by_no {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int a = sc.nextInt();

        if(a % 5 == 0 && a % 3 ==0){
            System.out.println("Apurva");

        }
        else if(a % 3 == 0){
            System.out.println("Pranav");

        }
        else if(a % 5 == 0){
            System.out.println("Riya");

        }
        else{
            System.out.print("Isha");
        }
            
        sc.close();
    
    }

}


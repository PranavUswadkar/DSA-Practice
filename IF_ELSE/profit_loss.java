package IF_ELSE;

import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Prize: ");
        double CP = sc.nextDouble();
        System.out.print("Enter Selling Prize: ");
        double SP = sc.nextDouble();

        if(SP - CP > 0){
            System.out.print("Seller has made profit: ");
            System.out.println(SP - CP);
            System.out.print("Profit Percentage: ");
            System.out.println(((SP-CP)/SP) * 100 + "%");
        }
        else if(SP - CP < 0){
            System.out.print("Seller has incurred loss: ");
            System.out.println(SP - CP);
            System.out.print("Loss Percentage: ");
            System.out.println(((SP - CP)/CP) * 100 + "%");

        }
        else{
            System.out.println("No Profit, No Loss");
            System.out.println(SP - CP);
            System.out.print("Percentage: ");
            System.out.println(((SP - CP)/SP) * 100 + "%");
        }
        sc.close();

    }
    
}

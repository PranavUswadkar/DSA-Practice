package IF_ELSE;
import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        if(no >= 0){
            System.out.println(no);
            if(no > 69){
                System.out.println("The magnitude is greater than 69");
            }
            else{
                System.out.println("The magnitude is less than 69");
            }

        }
        else{
            no = -no;
            System.out.println(no);//-- = +
            if(no > 69){
                System.out.println("The magnitude is greater than 69");
            }
            else{
                System.out.println("The magnitude is less than 69");
            }
            

        }
        sc.close();
        
        // if(no<0) no = -no;//in one line only
        // System.out.println(no);
        // sc.close();

    }
    
}

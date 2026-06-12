package HW;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            char ch = (char)('a' + i);//a, b, c, d..
            //convert to upper case for odd rows
            if(i%2 != 0){
                ch = Character.toUpperCase(ch);
            }
            for(int j=0; j<=n; j++){
                System.out.print(ch);
            }
            System.out.println();
    
        }
        sc.close();      
    }
}
   


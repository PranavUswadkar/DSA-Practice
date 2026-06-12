package Pattern;
import java.util.Scanner;
public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){// 1/4th portion
            for(int j=1; j<=2*n-1; j++){
                int a = i, b = j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
                System.out.print(Math.min(a,b)+ " ");
            }
            System.out.println();

        }
        // concept of fake value(sir)
        sc.close();
    }

    
}

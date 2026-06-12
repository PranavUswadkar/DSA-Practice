package Pattern;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        int nsp = n-1, nst = 1;//no of spaces and stars
        for(int i=1; i<=n; i++){//for no maths
            for(int j=1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
    
}

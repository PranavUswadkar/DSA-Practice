package Pattern;

public class vertically_inverted {
    public static void main(String[] args) {
        int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){ (loop of spaced triangle(normal)
        //        System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){ (loop for stared triangle(normal)
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1; i<=n; i++){// less optimal
            for(int j=1; j<=n; j++){
                if(i+j > n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
              
            System.out.println();
        }

    }
}

public class pattern {
    public static void main(String args[]){
        // int n = 6;
        // int m = 8;

        // // outer loop 
        // for(int i=1; i<=n; i++){
        //     //inner loop -> Space print
        //     for(int j=1; j<=m; j++){
        //         if(i==1||i==n||j==1||j==m){
        //             System.out.print("*");

        //         }
        //         else{
        //             System.out.print(" ")
        //         }
        //     }

        //     System.out.println();
        // }
   // }
        int n = 5;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }  
}

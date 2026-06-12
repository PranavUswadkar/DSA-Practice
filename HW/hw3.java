package HW;

public class hw3 {
    public static void main(String[] args) {
        int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n+1-i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n+1-i; j++){
                char ch = (char)('a'+j-1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
}

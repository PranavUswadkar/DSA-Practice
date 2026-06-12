package HW;

public class hw2 {
    public static void main(String[] args) {

        int n = 5;
        // for(int i=1;i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         char ch = (char)('A' + j-1);
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        //}
        // for(int  i=1; i<=n; i++){
        //     char ch = (char)('A'+ i-1);
        //     for(int j=1;  j<=i; j++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }
        for(int  i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                char ch = (char)('A'+ j-1);
                if(i%2 ==0){
                    System.out.print(ch);

                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
    
        }
        

    }
}

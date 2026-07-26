package Recurssion;

public class GCD {
    // public static void gcd(int a, int b){

        // int  gcd = 1;
        // for(int i=2; i <= Math.min(a, b); i++){
        //     if(a % i == 0 && b % i == 0){
        //         gcd = i;
        //     }
        // }
        // System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

    //}
    public static int gcd(int a, int b){
        if(b==0) return a;
        return(gcd(b%a, a));
    }
    public static int lcm(int a, int b){
        return((a*b)/gcd(a, b));
    }
    
    public static void main(String[] args){
        int a = 12;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }

}

package Recurssion;

public class rev {
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10, r*10+n%10);
    }
    public static void main(String[] args){
        int n=12345;
        System.out.println("The rev of the string is: " + reverse(n, 0));
    }
}

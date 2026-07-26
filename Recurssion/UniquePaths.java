package Recurssion;

public class UniquePaths {
    // public static int uniquePaths(int  m, int n){
    //     if(m==1 || n==1) return 1;
    //     return uniquePaths(m-1, n) + uniquePaths(n-1, m);

    // } not optimal time limit exceed as i fxn is called 2 times in single call
    public static int paths(int cr, int cc, int lr, int lc){
        if(cr == lr-1 && cc == lc-1) return 1;
        if(cr >= lr || cc >= lc) return 0;
        int right = paths(cr, cc + 1, lr, lc);
        int down = paths(cr + 1, cc, lr, lc);
        return right + down;
    }
    public static int  uniquepaths(int m, int n){
        return paths(0, 0, m, n);
    }
    public static void main(String[] args){
        int m = 3;
        int n = 7;
        System.out.println("Unique Paths in a grid of size " + m + " x " + n + " is: " + uniquepaths(m,n));
    }

    
}

package Recurssion;

public class TowerOfHanoi {
    public static void main(String[] args){
        hanoi(4, 'A', 'B', 'C');

    }
    private static void hanoi(int n, char src, char helper, char dest){

        if(n==0) return;
        //A=Source, B=Helper, C=Destination
        //move n-1 from A to B via C
        hanoi(n-1, src, dest, helper);
        //largest to destination
        System.out.println(src+"->"+dest);
        //n-1 from B to C via A
        hanoi(n-1, helper, src, dest);
        
    }
}

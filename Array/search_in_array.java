package Array;
import java.util.Scanner;
public class search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int n = sc.nextInt();
        int[] arr = {30, 40, 50, 60, 70, 80, 90, 100};
        boolean found = false;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == n){
                System.out.println("The element "+arr[i]+" exists in the array");
                found = true;
                

            }
        }
        if(!found){
            System.out.println("the element " + n + " does not exist in the array");
        }
        sc.close();
    }
    
}

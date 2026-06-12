package sort;

public class binary_sort_matrix {
    public static int[] searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length; // no of columns
        int lo = 0;
        int hi = m*n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int midElement = matrix[mid/n][mid%n];
            if(midElement == target) return new int[]{mid/n, mid%n};
            else if(midElement < target) lo = mid+1;
            else hi = mid-1;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,17,20},{23,30,34,50}};
        int target = 17;
        int[] result = searchMatrix(matrix, target);
        System.out.println("Element found at index: " + result[0] + ", " + result[1]);
    }
    
}

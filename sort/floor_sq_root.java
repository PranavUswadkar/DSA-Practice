package sort;

public class FloorSqrt {

    public static int floorSqrt(int n) {
        if(n==0) return 0;
        long low=1, high = n;

        while(low<=high){
            long mid = low + (high - low) / 2;
            if(mid == n/mid) return (int)mid;
            else if(mid < n/mid) low = mid+1;
            else high = mid-1;
        }
        return (int)high;

        public static void main(String[] args) {
        System.out.println(floorSqrt(14)); // 3
        }
    }
}
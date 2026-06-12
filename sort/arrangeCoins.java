package sort;

public class arrangeCoins {

    public static int floorSqrt(long n) {
        if(n==0) return 0;
        long low=1, high = n;

        while(low<=high){
            long mid = low + (high - low) / 2;
            if(mid == n/mid) return (int)mid;
            else if(mid < n/mid) low = mid+1;
            else high = mid-1;
        }
        return (int)high;

      
        
    }
    public int arrangeCoins(int n){
        long m = (long)n;
        return ((int)floorSqrt(8*m+1)-1)/2;
    }

    public static int arrangeCoins2(int n){
        long lo=0, hi=n, ans=0;
        while(lo <= hi){
            long k = lo + (hi-lo)/2;
            long m = k*(k+1)/2;//sum of first k natural numbers
            if(m == n)return (int)k;
            else if(m < n){
                ans = k;
                lo = k+1;
            }
            else hi = k-1;

        }
        return (int)ans;
    }
    public static void main(String[] args) {
        arrangeCoins ac = new arrangeCoins();
        System.out.println(ac.arrangeCoins(5)); // 2

        arrangeCoins ac2 = new arrangeCoins();
        System.out.println(ac2.arrangeCoins2(5)); // 2
    }

}

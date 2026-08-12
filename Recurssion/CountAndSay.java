package Recurssion;
public class CountAndSay{

    public static String countAndSay(int n){
        if(n==1) return "1";
        String s = countAndSay(n-1) + "#";//increasing the length of the string for last step
        String ans = "";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }   
        }
        return ans;
    }
    public static void main(String[] args){
        String ans = countAndSay(5);
        System.out.println(ans);

    }
}
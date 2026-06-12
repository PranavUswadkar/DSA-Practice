package String;

public class Compare {

    public static int myCompareTo(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int min = Math.min(len1, len2);

        //Compare characters one by one
        for(int i=0; i<min; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);//returns int as arithmetic operations are performed
            }
        }

        //If all compared characters are same,
        //shorter string is considered smaller
        return len1 - len2;


    }
    public static void main(String[] args){
        System.out.println(myCompareTo("apple", "appel"));
        System.out.println(myCompareTo("apple", "apricot"));
        System.out.println(myCompareTo("bat", "ball"));
        System.out.println(myCompareTo("cat", "cats"));
    }

   
}

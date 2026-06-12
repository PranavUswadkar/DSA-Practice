package String;

public class BuiltInMethods {
    public static void main(String[] args){
        String s = "harshita";
        System.out.println(s.contains("harsh"));//boolean
        if(s.contains("arsh"))
            System.out.println("happy");
        System.out.println(s.startWith("ha"));//boolean
    }
}

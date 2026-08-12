

public class UserDefinedDataType{//Khud ka ek dtatype bana liya hai
    public static class Student{
        String name;
        int rno;
        double cgpa;

    }
    public static void  main(String[] args){
        Student s1 = new Student(); // declaration
        s1.name = "pranav";
        s1.rno = 72;
        s1.cgpa = 9;

        System.out.print(s1.name+" "+ s1.rno + " " + s1.cgpa);

    }

}

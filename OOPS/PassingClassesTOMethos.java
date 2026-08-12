public class PassingClassesTOMethos{
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
    }
    public static void main(String[] args){
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);// pass by reference

        System.out.println(c.seats);
    }
    public static void change(Car c){
        c.seats = 7;
    }
}
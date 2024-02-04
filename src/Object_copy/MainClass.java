package Object_copy;

public class MainClass {
    public static void main(String[] args) {
        Car car1  = new Car("Ford" , "Mustang", 2020);
        Car car2  = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        // car1.toString();
        // car2.toString();

        System.out.println(car1.getModel());
        System.out.println(car1.getMake());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getModel());
        System.out.println(car2.getMake());
        System.out.println(car2.getYear());
        // System.out.println(car1.getModel());
    }
    
}

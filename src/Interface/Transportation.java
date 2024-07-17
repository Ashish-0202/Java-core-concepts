package Interface;

public class Transportation {
    public static void main(String[] args) {
        Bike bike=new Bike();
        System.out.println(bike.Vtype());
        System.out.println(bike.wheels());
        bike.defaultmethod();

        Car car=new Car();
        System.out.println(car.Vtype());
        System.out.println(car.wheels());

    }
}

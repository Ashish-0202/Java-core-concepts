package Interface;

public class Bike implements Vehicle{

    @Override
    public String Vtype() {
        return "Bike";
    }

    @Override
    public int wheels() {
        return 2;
    }
}

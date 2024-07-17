package Interface;

public class Car implements Vehicle{


    @Override
    public String Vtype() {
        return "Defender";
    }

    @Override
    public int wheels() {
        return 4;
    }
}

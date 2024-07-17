package Interface;

public interface Vehicle{
    String Vtype();

    int wheels();

    default void defaultmethod() {
        System.out.println("Printing from default method..!");
    }
}

package Interface;

//All the methods in an interface are public and abstract by default
public interface Vehicle{
    String Vtype();

    int wheels();

    default void defaultmethod() {
        System.out.println("Printing from default method..!");
    }
}

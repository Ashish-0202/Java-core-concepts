package StreamAPI.IntermediateOperations;

//Map will transform the given stream into another form
//Basically it will map the given function for all its objects

//It has a Function interface which is also a FunctionalInterface

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("ashish","akshay","accu");

        list.stream()
                //This will convert/transform every stream object into Uppercase
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

package Generics;

//We know that in generics we can create a class that accepts any data types except primitive types
//But in some case if we want our generic to accept some specific type(Such as data of number types) then we can use bounded generic types
public class BoundedGenerics {
    public static void main(String[] args) {
        Worker<Integer> onj=new Worker<>(23);
    }
}

//In case of bound types we are using extend keyword
//This Worker class is created with bounded type with extending Number
//It means this class will work only with the data types that are children of number(Integer,Double So on..!)
class Worker<E extends Number>{

    E id;

    public Worker(E data){
        this.id=data;
    }

    public E getid(){
        return id;
    }
}
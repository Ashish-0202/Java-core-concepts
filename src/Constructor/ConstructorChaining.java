package Constructor;

public class ConstructorChaining {
    //we have an instance variable
    int i;

    //I have a default constructor in which i'm using this keyword to invoke parameterized constructor within same class
    public ConstructorChaining(){
        this(10);
        //Note: we can also invoke parent class constructors using super keyword
    }

    //Parameterized constructor
    public ConstructorChaining(int x){
        this.i = x;
    }

    public static void main(String[] args) {
        //Invoked default constructor and it invoked the parametrized constructor
        ConstructorChaining chaining= new ConstructorChaining();
        System.out.println(chaining.i);
    }

}

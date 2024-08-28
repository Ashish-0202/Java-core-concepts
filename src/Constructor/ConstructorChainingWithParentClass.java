package Constructor;

class Parent{
    int i;

    public Parent(int x){
        this.i=x;
    }
}

public class ConstructorChainingWithParentClass extends Parent{


    public ConstructorChainingWithParentClass(int x){
        super(x);
    }

    public static void main(String[] args) {
        ConstructorChainingWithParentClass constructorChainingWithParentClass= new ConstructorChainingWithParentClass(20);

        System.out.println(constructorChainingWithParentClass.i);
    }

}

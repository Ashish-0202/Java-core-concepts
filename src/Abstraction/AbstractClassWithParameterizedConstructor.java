package Abstraction;

abstract class myAbstractclassNew{
    public int a;
    public int b;

    public myAbstractclassNew(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void print(){
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}

public class AbstractClassWithParameterizedConstructor extends myAbstractclassNew {
    public AbstractClassWithParameterizedConstructor(int a, int b) {
        super(a, b);
    }

    public static void main(String[] args) {
        AbstractClassWithParameterizedConstructor constructor=new AbstractClassWithParameterizedConstructor(10,30);

        constructor.print();
    }
}

package LambdaExpression;

@FunctionalInterface
interface A1{
    void show();
}

public class Demo1 {
    public static void main(String[] args) {
        //Without lambda expression
        A1 obj=new A1() {
            @Override
            public void show() {
                System.out.println("In show method..!");
            }
        };

        obj.show();

        //With lambda expression
        A1 obj2= () -> {
            System.out.println("In show with lambda expression..!");
        };

        obj2.show();
    }
}

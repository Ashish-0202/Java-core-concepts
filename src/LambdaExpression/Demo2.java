package LambdaExpression;

@FunctionalInterface
interface B2{
    void show(int i);
}

public class Demo2 {
    public static void main(String[] args) {
        //Without lambda expression and int parameter
        B2 obj3=new B2() {
            @Override
            public void show(int i) {
                System.out.println("In show with parameter:"+i);
            }
        };
        obj3.show(10);

        //With Lambda expression and int parameter

        B2 obj4= i -> System.out.println("In show method with lambda exp and parameter:"+i);

        obj4.show(20);
    }
}

package LambdaExpression;

@FunctionalInterface
interface calci{
    int add(int i,int j);
}

public class Demo3 {
    public static void main(String[] args) {

        calci object= (i,j) -> {
            return i+j;
        };

        int result= object.add(10,40);
        System.out.println(result);
    }
}

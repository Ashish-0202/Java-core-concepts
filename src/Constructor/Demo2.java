package Constructor;

//Parameterised constructor

public class Demo2 {

    int x;
    int y;

    public Demo2(int x,int y){
        this.x = x;
        this.y=y;
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2(6,10);

        System.out.println(demo2.x + ":" + demo2.y);
    }
}

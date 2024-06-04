package Strings;

public class StringBuffer_Builder {
    public static void main(String[] args) {
        //StringBuffer is a class used to create a mutable string
        //minimum capacity will be 16
        StringBuffer sb=new StringBuffer("Ashish");

        System.out.println(sb.capacity());

        System.out.println(sb);
        //We can add more value to string using append function
        sb.append(" Shenoy");

        System.out.println("Appended String: "+sb);

        System.out.println("====String Builder====");
        //StringBuilder is also a class used to create a mutable string
        StringBuilder sd=new StringBuilder("Pruthvi");

        System.out.println(sd);

        //All methods are same for string builder as well
        sd.append(" Holla");

        System.out.println("Appended String: "+sd);

        //Note: Major difference between String Buffer and builder is String Buffer is Synchronized & thread safe but String builder is not
        //Choose wisely if you have multithreaded application then go for buffer.
    }
}

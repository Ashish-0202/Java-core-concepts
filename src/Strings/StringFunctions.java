package Strings;

public class StringFunctions {
    public static void main(String[] args) {
        //We can use + operator to concatenate two or more strings
        String firstname="Tony";
        String Secondname="Stark";
        //We are adding " " empty space between two string using +
        String fullname=firstname+" " +Secondname;

        System.out.println(fullname);

        //length() function is used to get the length of the string
        System.out.println("Length of the String: "+ fullname.length());

        //charAt() function will print the character from the string at given index
        //We might use for loop to print each character from the string & i is the index
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //compareTo() function will be used to compare two string values
        //It will compare based on each character value
        //Note: We can also use == operator but in some cases it fails
        String value1="Tony";
        String value2="Tonyyy";
        if(value1.compareTo(value2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //substring() used to get a separate string from an existing string
        //we need to give starting index of a string & ending index will be the length()-1 by default or else we can explicitly define
        System.out.println("======substring()======");
        String sentence="This is Tony Stark";
        String name=sentence.substring(8,12);
        System.out.println(name);
        String name2=sentence.substring(8);
        System.out.println(name2);
    }
}

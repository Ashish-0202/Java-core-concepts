package Coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        College college=new BCA();

        college.firstLanguage();
    }
}

interface College{
    void firstLanguage();
}

class BCA implements College{

    @Override
    public void firstLanguage() {
        System.out.println("Hindi is my first language..!");
    }
}

class BSC implements College{

    @Override
    public void firstLanguage() {
        System.out.println("Kannada is my first language..!");
    }
}

//Here in the above example there is no dependency between the classes and interface, basically if you change anything in the BCA or BSC class
//you don't need to change it in the College interface
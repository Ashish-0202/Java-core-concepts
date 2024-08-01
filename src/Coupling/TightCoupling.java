package Coupling;

public class TightCoupling {
    public static void main(String[] args) {
        Subject subject=new Subject();

        subject.startReading();
    }
}

class Subject{
    Topic t= new Topic();

    public void startReading(){
        t.understand();
    }
}

class Topic{
    public void understand(){
        System.out.println("Tight coupling concept understood..!");
    }
}

//In the above example, subject class is dependent on Topic class and if you want to change the understand()
// method into gotit() method in topic class you also need to change it in the subject class as well.
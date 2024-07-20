package Encapsulation;

//Encapsulation is the process of binding the data members and methods into single unit
//Here we declare the data members with private field restricting the access from outer classes
//And we declare certain public methods to outer world to access it.
class Profile{
    private String firstname;

    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Profile profile=new Profile();

        profile.setFirstname("Ashish");
        System.out.println(profile.getFirstname());
    }
}

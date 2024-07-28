package CollectionFramework.Set;

import java.util.Objects;

public class Student {
    String name;
    int rollno;

    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }
}

package CollectionFramework.CollectionsClass;

public class Employee implements Comparable<Employee>{
    int empid;

    String empname;

    public Employee(int id,String name){
        this.empid=id;
        this.empname=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee that) {
        return this.empid - that.empid;
    }
}

package StreamAPI.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {
    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();

        employees.add(new employee("Ashish","IT",40000));
        employees.add(new employee("Anil","Finance",60000));
        employees.add(new employee("Ashwini","HR",30000));
        employees.add(new employee("Swathi","HR",70000));
        employees.add(new employee("Adith","IT",20000));

        Map<Boolean, List<employee>> partitionedEmp = employees.stream()
                .collect(Collectors.partitioningBy(emp-> emp.getSalary()>50000));

        System.out.println("Employee Salary > 50000:");
        partitionedEmp.get(true).forEach(System.out::println);

        System.out.println("Employee Salary < 50000:");
        partitionedEmp.get(false).forEach(System.out::println);
    }
}

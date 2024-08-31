package StreamAPI.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();

        employees.add(new employee("Ashish","IT",40000));
        employees.add(new employee("Anil","Finance",60000));
        employees.add(new employee("Ashwini","HR",30000));
        employees.add(new employee("Swathi","HR",50000));
        employees.add(new employee("Adith","IT",20000));

        Map<String , List<employee>> emp = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        emp.forEach((dep,emplist)->{
            System.out.println("Department:"+dep);
            emplist.forEach(System.out::println);
        });
    }
}

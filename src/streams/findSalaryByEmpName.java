package streams;

import model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class findSalaryByEmpName {


    public static void main(String[] args) {
        way1();
        System.out.println("----------------------");
        way2();

    }

    public static void way1() {
        List<Employee> employees = Employee.setAllEmployees();

        String[] filterNames = {"Rohan", "Baju", "Baju"};

        Set<String> filterSet = new HashSet<>(Arrays.asList(filterNames));

        Map<String, Long> namesSalaryMap = employees.stream()
                .filter(e -> filterSet.contains(e.getName()))
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        namesSalaryMap.forEach((name, salary) -> {
            System.out.println(name + "-> " + salary);
        });
    }

    // it returns the default value i.e. 0 for the non-existing keys
    public static void way2() {
        List<Employee> employees = Employee.setAllEmployees();

        String[] filterNames = {"Rohan", "Baju", "Baju","kaju"};


        Map<String, Long> empMap = employees.stream()
                .collect(Collectors.toMap(e->e.getName().
                        toLowerCase(),
                        Employee::getSalary));

        Map<String, Long> namesSalaryMap = Arrays.stream(filterNames)
                .map(item->item.toLowerCase(Locale.ROOT))
                .collect(Collectors.toMap(
                        name -> name,
                        salary -> empMap.getOrDefault(salary, 0L),
                        (oldVal, newVal) -> newVal,
                        LinkedHashMap::new
                ));

        namesSalaryMap.forEach((name, salary) -> {
            System.out.println(name + "-> " + salary);
        });
    }
}

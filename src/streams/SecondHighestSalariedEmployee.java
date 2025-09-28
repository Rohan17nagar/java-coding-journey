package streams;

import model.Employee;

import java.util.Comparator;
import java.util.List;

/*
 * Create a program to get the second highest paid employee from the list of employees.
 * */
public class SecondHighestSalariedEmployee {

    public static void main(String[] args) {
        way1();
        way2();
    }

    public static void way1() {
        List<Employee> employees = Employee.setAllEmployees();

        Employee secondHighest = employees.stream().
                sorted(Comparator.comparing(Employee::getSalary).reversed()).
                distinct().
                skip(2).
                findFirst().
                orElse(null);

        System.out.println(secondHighest);
    }

    public static void way2() {
        List<Employee> employees = Employee.setAllEmployees();

        Long secondHighest = employees.stream()
                .mapToLong(Employee::getSalary)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(1L);

        System.out.println(secondHighest);
    }


}

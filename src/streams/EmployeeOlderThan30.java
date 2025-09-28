package streams;

import model.Employee;

import java.util.List;

/*
 * Get the list of employees who's ages are equal to or greater than 30 years.
 *
 */
public class EmployeeOlderThan30 {

    public static void main(String[] args) {

        List<Employee> employeeList = Employee.setAllEmployees();
        // Printing the employees Age:
        for (Employee e : employeeList) {
            System.out.println(e.getAge());
        }

        List<Employee> moreThan30 = employeeList.stream()
                .filter(e -> e.getAge() >= 30).toList();

        for (Employee e : moreThan30) {
            System.out.println(e);
        }
    }
}

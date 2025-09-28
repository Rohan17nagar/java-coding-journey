package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    Integer id;
    String name;
    Integer age;
    Long salary;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> setAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp = new Employee();
        emp.setAge(30);
        emp.setSalary(30000L);
        emp.setId(1);
        emp.setName("Rohan");

        Employee emp4 = new Employee();
        emp4.setAge(7);
        emp4.setSalary(70000L);
        emp4.setId(4);
        emp4.setName("pohan");

        Employee emp2 = new Employee();
        emp2.setAge(40);
        emp2.setSalary(50000L);
        emp2.setId(2);
        emp2.setName("Raju");

        Employee emp3 = new Employee();
        emp3.setAge(20);
        emp3.setSalary(20000L);
        emp3.setId(3);
        emp3.setName("Kaju");

        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        return employeeList;
    }
}

package pro.sky.skyprospringHW2_5Collections.service;

import pro.sky.skyprospringHW2_5Collections.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int salary, int departmentId);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> getAllEmployee();
}

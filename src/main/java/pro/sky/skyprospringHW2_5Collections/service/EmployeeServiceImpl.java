package pro.sky.skyprospringHW2_5Collections.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringHW2_5Collections.exception.EmployeeAlreadyAddedException;
import pro.sky.skyprospringHW2_5Collections.exception.EmployeeNotFoundException;
import pro.sky.skyprospringHW2_5Collections.exception.EmployeeStorageIsFullException;
import pro.sky.skyprospringHW2_5Collections.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Integer maxEmpoyeeCountInCompany = 2;

    private Map<String, Employee> employees = new HashMap<>();

    private static String getKey(String firstName, String lastName) {
        return firstName + lastName;
    }

    @Override
    public Employee add(String firstName, String lastName, int salary, int departmentId) {
        String key = getKey(firstName, lastName);
        if (employees.containsKey(getKey(firstName, lastName))) {
            throw new EmployeeAlreadyAddedException();
        } else if (employees.size() >= maxEmpoyeeCountInCompany) {
            throw new EmployeeStorageIsFullException();
        }
        Employee employee = new Employee(firstName, lastName, salary, departmentId);
        employees.put(key, employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName, int salary, int departmentId) {
        Employee employee = new Employee(firstName, lastName, salary, departmentId);
        if (employees.containsKey(getKey(firstName, lastName))) {
            employees.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstName, String lastName, int salary, int departmentId) {
        Employee employee = new Employee(firstName, lastName, salary, departmentId);
        if (employees.containsKey(getKey(firstName, lastName))) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Map<String, List<Employee>> getAll() {
        return Map.of();
    }
}

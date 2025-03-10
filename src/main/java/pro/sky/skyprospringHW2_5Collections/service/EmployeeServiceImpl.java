package pro.sky.skyprospringHW2_5Collections.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
import pro.sky.skyprospringHW2_5Collections.exception.EmployeeAlreadyAddedException;
import pro.sky.skyprospringHW2_5Collections.exception.EmployeeNotFoundException;
import pro.sky.skyprospringHW2_5Collections.exception.EmployeeStorageIsFullException;
import pro.sky.skyprospringHW2_5Collections.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;
    private Integer maxEmpoyeeCountInCompany = 2;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        } else if (employeeList.size() >= maxEmpoyeeCountInCompany) {
            throw new EmployeeStorageIsFullException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableList(employeeList);
    }
}

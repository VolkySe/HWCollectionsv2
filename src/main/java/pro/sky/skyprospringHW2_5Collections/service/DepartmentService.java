package pro.sky.skyprospringHW2_5Collections.service;

import pro.sky.skyprospringHW2_5Collections.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee getEmployeeWithMaxSalary(int departmentId);

    Employee getEmployeeWithMinSalary(int departmentId);

    List<Employee> getAllEmployeesInDepartment(int departmentId);

    Map<Integer, List<Employee>> getAllEmployeesGroupedByDepartment();
}

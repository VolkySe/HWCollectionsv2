package pro.sky.skyprospringHW2_5Collections.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringHW2_5Collections.model.Employee;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee getEmployeeWithMaxSalary(int departmentId) {
        return employeeService.getAll()
                .values()
                .stream()
                .filter(employees -> employees.size());
    }

    @Override
    public Employee getEmployeeWithMinSalary(int departmentId) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployeesInDepartment(int departmentId) {
        return List.of();
    }

    @Override
    public Map<Integer, List<Employee>> getAllEmployeesGroupedByDepartment() {
        return Map.of();
    }
}

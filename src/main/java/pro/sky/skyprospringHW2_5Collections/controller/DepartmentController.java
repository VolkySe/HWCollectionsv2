package pro.sky.skyprospringHW2_5Collections.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringHW2_5Collections.model.Employee;
import pro.sky.skyprospringHW2_5Collections.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("departments")
public class DepartmentController extends EmployeeController {

    public DepartmentController(EmployeeService employeeService) {
        super(employeeService);
    }

    @GetMapping("max-salary")
    public Employee getEmployeeWithMaxSalary(@RequestParam int departmentId) {
        return null;
    }

    @GetMapping("min-salary")
    public Employee getEmployeeWithMinSalary(@RequestParam int departmentId) {
        return null;
    }

    @GetMapping("all")
    public List<Employee> getAllEmployeesInDepartment(@RequestParam int departmentId) {
        return null;
    }

    @GetMapping("all-grouped")
    public Map<Integer, List<Employee>> getAllEmployeesGroupedByDepartment() {
        return null;
    }

}

package pro.sky.skyprospringHW2_5Collections.service;

import pro.sky.skyprospringHW2_5Collections.model.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Map<String, List<Employee>> getAll();
}

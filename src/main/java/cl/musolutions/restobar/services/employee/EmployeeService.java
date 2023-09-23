package cl.musolutions.restobar.services.employee;

import cl.musolutions.restobar.entities.Employee;

public interface EmployeeService {
    Iterable<Employee> get();
    Employee add(Employee employee);
    Employee edit(int id, Employee employee);
    Employee deactivate(int id);
}

package cl.musolutions.restobar.services.employee;

import cl.musolutions.restobar.entities.Employee;
import cl.musolutions.restobar.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Iterable<Employee> get() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        try{
            return employeeRepository.save(employee);
        }catch (Exception ex){
            return null;
        }
    }

    @Override
    public Employee edit(int id, Employee employee) {
        return null;
    }

    @Override
    public Employee deactivate(int id) {
        return null;
    }
}

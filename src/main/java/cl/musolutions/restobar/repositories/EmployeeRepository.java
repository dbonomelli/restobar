package cl.musolutions.restobar.repositories;

import cl.musolutions.restobar.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

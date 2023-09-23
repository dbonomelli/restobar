package cl.musolutions.restobar.controllers;

import cl.musolutions.restobar.entities.Employee;
import cl.musolutions.restobar.services.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public ResponseEntity<Iterable<Employee>> get(){
        try{
            return ResponseEntity.ok(employeeService.get());
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }

    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> add(@RequestBody Employee employee){
        try{
            return ResponseEntity.ok(employeeService.add(employee));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}

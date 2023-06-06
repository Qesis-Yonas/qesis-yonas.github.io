package net.java.springboot.controller;


import net.java.springboot.exception.ResourseNotFoundException;
import net.java.springboot.model.Employee;
import net.java.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("id/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable Long id){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResourseNotFoundException("Employee with the following id does not exist"+ id));
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}

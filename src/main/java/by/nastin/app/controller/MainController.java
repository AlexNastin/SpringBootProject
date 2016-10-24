package by.nastin.app.controller;

import by.nastin.app.entity.Employee;
import by.nastin.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    @Qualifier("employeeRepository")
    private EmployeeRepository employeeRepository;

    @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}

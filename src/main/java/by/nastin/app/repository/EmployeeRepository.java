package by.nastin.app.repository;

import by.nastin.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Override
    List<Employee> findAll();

    List<Employee> findByName(String name);

    List<Employee> findByIdDepartment(Integer id);

}

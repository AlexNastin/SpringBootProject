package by.nastin.app.repository;

import by.nastin.app.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Override
    List<Employee> findAll();

    List<Employee> findByName(String name);

    List<Employee> findByIdDepartment(Integer id);

}

package by.nastin.app.repository;


import by.nastin.app.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Override
    List<Department> findAll();

}

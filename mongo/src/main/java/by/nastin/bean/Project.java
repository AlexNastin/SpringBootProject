package by.nastin.bean;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Objects;

@Document(collection = "project")
public class Project extends BaseEntity{

    private Integer[] employees;


    public Integer[] getEmployees() {
        return employees;
    }

    public void setEmployees(Integer[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Project project = (Project) o;
        return Arrays.equals(employees, project.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employees);
    }

    @Override
    public String toString() {
        return "Project{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}

package by.nastin.app.entity;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "employee")
@AttributeOverride(name = "id", column = @Column(name = "id_employee"))
public class Employee extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "id_department")
    private Integer idDepartment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(idDepartment, employee.idDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, idDepartment);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idDepartment=" + idDepartment +
                '}';
    }
}

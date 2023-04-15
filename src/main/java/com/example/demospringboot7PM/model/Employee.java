package com.example.demospringboot7PM.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class Employee {

    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empId")
    @SequenceGenerator(name = "empId", sequenceName = "empId", initialValue = 1,allocationSize = 1)
    long empId;
    String department;
    double salary;

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    public Employee(String name, long empId, String department, double salary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

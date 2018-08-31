package com.zemoso;


import com.zemoso.model.NamedEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Department extends NamedEntity {

    @OneToMany(mappedBy="department",cascade= CascadeType.ALL)
    private List<Employee> employees = new ArrayList<Employee>();

    public Department() {}
    public Department(String name) {
        this.setName(name);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

}

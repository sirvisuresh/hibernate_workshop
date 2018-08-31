package com.zemoso;

import com.zemoso.model.Person;

import javax.persistence.*;


@Entity
@Table
public class Employee extends Person {

    @ManyToOne
    private Department department;

    public Employee(){}

    public Employee(String firstname, String lastname, Department department)
    {  this.setFirstName(firstname);
       this.setLastName(lastname);
       this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String departmentName;
        if(department==null)
            departmentName="NULL";
        else
            departmentName=department.getName();

        return "Employee [id=" + getId() + ", name=" + getFirstName() + " " + getLastName() + ", department="
                + departmentName + "]";
    }
}



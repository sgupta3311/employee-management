package com.sg.model;

import java.util.List;

public class Employee {
    private String name;
    private float age;
    private List<String> skillSet;

    private Boolean isManager;

    private String employeeType;
    private String managerName;

    private String designation;

    private Double salary;

    public Employee(String name, float age, List<String> skillSet, Boolean isManager, String employeeType, String managerName,String designation,Double salary) {
        this.name = name;
        this.age = age;
        this.skillSet = skillSet;
        this.isManager = isManager;
        this.employeeType = employeeType;
        this.managerName = managerName;
        this.designation=designation;
        this.salary=salary;
    };

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public List<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }

    public Boolean isManager() {
        return isManager;
    }

    public void setManager(Boolean manager) {
        isManager = manager;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skillSet=" + skillSet +
                ", isManager=" + isManager +
                ", employeeType='" + employeeType + '\'' +
                ", managerName='" + managerName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

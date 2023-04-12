package com.sg.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {
     private static List<Employee> employeeList=new ArrayList<>();
    public static List<Employee> getEmployeeDetails(){
        Employee e1=new Employee("Sam",43.2f, Arrays.asList("Java","Testing"),false,"E","Paul","Engineer",88000.0);
        Employee e2=new Employee("Allan",31.2f, Arrays.asList("Devops","Java"),false,"E","Paul","Engineer",100000.0);
        Employee e3=new Employee("Paul",48.2f, Arrays.asList("Project Management","Business Analyst"),true,"M","Patrick","Manager",100000.0);
        Employee e4=new Employee("Patrick",58.2f, Arrays.asList("CEO","Project Management"),true,"M","Null","CEO",100000.0);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        return employeeList;
    }



}

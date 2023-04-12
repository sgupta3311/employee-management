package com.sg.businesslogic;

import com.sg.model.Employee;
import com.sg.model.EmployeeDataBase;

import java.util.List;

public class EngineerList {

    public static List<Employee> engineerList;

    public static void getEngineerName(){
        List<Employee> tempEngineerList= EmployeeDataBase.getEmployeeDetails();
        for(Employee engineer:tempEngineerList){
            if(!engineer.isManager()){
                System.out.println("Engineer names : "+engineer.getName());
                engineerList.add(engineer);
            }

        }
    }
}

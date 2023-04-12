package com.sg.businesslogic;

import com.sg.model.Employee;
import com.sg.model.EmployeeDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ManagerList {

    private static List<Employee> managerList;
   private static List<Employee> tempEmpList= EmployeeDataBase.getEmployeeDetails();

   private static Predicate<Employee> isManagerFlag=(employee) -> {
       return employee.isManager();
   };


   public static void getManagerName_functional(){
        tempEmpList.forEach(employee -> {
            if(isManagerFlag.test(employee)){
                System.out.println("Manager Name 1.8 : "+employee.getName());
            }
        });
    }

    public static void getManagerReporteeList_functonal(String managerName){
        tempEmpList.forEach(employee -> {
            if( !isManagerFlag.test(employee) && employee.getManagerName().equalsIgnoreCase(managerName)){
                System.out.println("List of reportees : "+employee.getName() + " for the manager " +employee.getManagerName());
            }
            else{
                System.out.println(managerName +" doesnt have reportee..");
            }
        });
    }

    public static void getTotalEmployeeSalary(){
        System.out.println("Total Salary : " +tempEmpList.stream().map(employee -> employee.getSalary()).reduce(0.0,(a,b)->a+b));
        System.out.println("Total Salary with method reference: " +tempEmpList.stream().map(employee -> employee.getSalary()).reduce(0.0,Double::sum));

    }
    public static void getManagerName(){

        for(Employee employee:tempEmpList){
            if(employee.isManager()){
                System.out.println("Manager Name : "+employee.getName());
            }
        }
    }
    public static void getManagerReporteeList(String managerName){
        for(Employee employee:tempEmpList){
            if(!employee.isManager() && employee.getManagerName().equalsIgnoreCase(managerName)){
                System.out.println("List of reportees : "+employee.getName() + " for the manager " +employee.getManagerName());
            }
        }
    }


}

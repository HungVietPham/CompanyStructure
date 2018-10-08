package com.github.khardrix.companyStructure;


/*******************************************************************************************
 *******************************************************************************************
 *****                                 *| Employee |*                                  *****
 *****---------------------------------------------------------------------------------*****
 *******************************************************************************************
 ******************************************************************************************/



public class Employee {

    private String name;
    private double salary;
    private int employeeID;
    private static int numberOfEmployees = 0;


    public Employee(String name, double salary){

        this.name = name;
        this.salary = salary;
        int employeeID = this.numberOfEmployees;
        numberOfEmployees++;

    }


    public double getBaseSalary(){

        return this.salary;
    }


    public String getName(){

        return this.name;
    }


    public int getEmployeeID(){

        return employeeID;
    }
}

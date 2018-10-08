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
    private static int employeeID = 1;


    public Employee(String name, double salary){

        this.name = name;
        this.salary = salary;
        int employeeID = this.employeeID++;

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

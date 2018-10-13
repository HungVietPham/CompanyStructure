package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                                 *| Employee |*                                  *****
 *******************************************************************************************
 ******************************************************************************************/

public abstract class Employee {

    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;
    private static int numberOfEmployees = 0;


    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        ++numberOfEmployees;
        this.employeeID = numberOfEmployees;
    }


    public int getEmployeeID() {
        return employeeID;
    }


    public void setEmployeeID(int employessID) {
        this.employeeID = employessID;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getBaseSalary() {
        return this.baseSalary;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public Employee getManager() {
        return this.manager;
    }


    public Employee setManager(Employee emp) {
        return this.manager = emp;
    }


    public boolean equals(Employee other) {
        if (this.employeeID == other.getEmployeeID()) {
            return true;
        }
        return false;
    }


    public String toString() {
        return this.employeeID + " " + this.name;
    }


    abstract public String employeeStatus();
}

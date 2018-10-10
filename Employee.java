package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                                 *| Employee |*                                  *****
 *****---------------------------------------------------------------------------------*****
 *****                             Unfinished Methods: 1                               *****
 *******************************************************************************************
 ******************************************************************************************/

public abstract class Employee {

    private String name;
    private double salary;
    private int employeeID;
    private static int numberOfEmployees = 0;


    public Employee(String name, double salary){

        /*
        Should construct a new employee object and take in two parameters,
        one for the name of the user and one for their base salary
         */
        this.name = name;
        this.salary = salary;
        numberOfEmployees++;
        employeeID = numberOfEmployees;
    }


    public double getBaseSalary(){

        /*
        Should return the employee's current salary
         */
        return this.salary;
    }


    public String getName(){

        /*
        Should return the employee's current name
         */
        return this.name;
    }


    public int getEmployeeID(){

        /*
        Should return the employee's ID. The ID should be issued on behalf of the employee
        at the time they are constructed.
        The first ever employee should have an ID of "1", the second "2" and so on
         */
        return this.employeeID;
    }

    // NOT FINISHED!!!!!!!
   // public Employee getManager(){

           /*
            Should return a reference to the Employee object that represents this employee's manager
           */

   //     return
    //}


    public boolean equals(Employee other){

        /*
        Should return true if the two employee IDs are the same, false otherwise
         */
        return (this.employeeID == other.employeeID);
    }


    public String toString(){

        /*
        Should return a String representation of the employee that is a combination of
        their id followed by their name. Example: "1 Kasey"
         */
        return employeeID + " " + name;
    }


    /*
    Should return a String representation of that Employee's current status.
    This will be different for every subclass of Employee
     */
    abstract String employeeStatus();
}

/*******************************************************************************************
 *******************************************************************************************
 *****                                 *| Employee |*                                  *****
 *****---------------------------------------------------------------------------------*****
 *****                             Unfinished Methods: 0                               *****
 *******************************************************************************************
 ******************************************************************************************/

abstract class Employee{

    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;
    private static int numberOfEmployees = 0;


    public Employee(String name, double baseSalary){

        /*
            Should construct a new employee object and take in two parameters,
            one for the name of the user and one for their base salary
         */

        this.name = name;
        this.baseSalary = baseSalary;
        numberOfEmployees++;
        employeeID = numberOfEmployees;
    }


    public double getBaseSalary(){

        /*
            Should return the employee's current salary
         */

        return baseSalary;
    }


    public String getName(){

        /*
            Should return the employee's current name
         */

        return name;
    }


    public int getEmployeeID(){

        /*
            Should return the employee's ID.
            The ID should be issued on behalf of the employee
            at the time they are constructed.
            The first ever employee should have an ID of "1",
            the second "2" and so on
         */

        return employeeID;
    }


    public Employee getManager(){

        /*
            Should return a reference to the Employee object
            that represents this employee's manager
         */

        return manager;
    }


    public boolean equals(Employee other){

        /*
            Should return true if the two employee IDs are the same,
            false otherwise
         */

        return (this.employeeID == other.employeeID);
    }


    public String toString(){

        /*
            Should return a String representation of the employee
            that is a combination of their id
            followed by their name. Example: "1 Kasey"
         */

        return employeeID + " " + name;
    }


    abstract String employeeStatus();
    /*
        Should return a String representation
        of that Employee's current status.
        This will be different for every subclass of Employee
     */


    ////////// METHODS ADDED BY ME. WOULD LIKE TO NOT ADD ANY METHODS, IF POSSIBLE //////////


    public void setManager(Employee manager){

        /*
            Added by me: So that an outside class can set
            the Employee value of manager.
         */

        this.manager = manager;
    }
}
package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                             *| BusinessEmployee |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             Unfinished Methods: 2                               *****
 *******************************************************************************************
 ******************************************************************************************/

public class BusinessEmployee extends Employee{
    //NOT FINISHED!!!!!!!
    private static double bonusBudget = 0;


    public BusinessEmployee(String name){

        /*
        Has a default salary of 50000
         */
        super(name, 50000);
    }

    // NOT FINISHED!!!!!!!
    public double getBonusBudget(){

        /*
        Should establish a running tally of the remaining bonusBudget for
        the team this employee supports.
        How that budget is determined will depend on which type of Business Employee it is
         */
        return bonusBudget;
    }

    // NOT FINISHED!!!!!!!
    public String employeeStatus(){

        /*
        Should return a String representation of this BusinessEmployee that includes their
        ID, name and the size of their currently managed budget.
        Example: "1 Kasey with a budget of 22500.0"
         */
        return super.toString() + " with a budget of //THIS NUMBER WILL BE FILLED IN " +
                "BY ANOTHER METHOD IN ANOTHER CLASS//";
    }
}

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

        super(name, 50000);
    }

    // NOT FINISHED!!!!!!!
    public double getBonusBudget(){

        return bonusBudget;
    }

    // NOT FINISHED!!!!!!!
    public String employeeStatus(){

        return super.toString() + " with a budget of //THIS NUMBER WILL BE FILLED IN " +
                "BY ANOTHER METHOD IN ANOTHER CLASS//";
    }
}

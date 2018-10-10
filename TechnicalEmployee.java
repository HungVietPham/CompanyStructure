package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                            *| TechnicalEmployee |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 1                               *****
 *******************************************************************************************
 ******************************************************************************************/

public class TechnicalEmployee extends Employee{


    public TechnicalEmployee(String name){

        /*
        Has a default base salary of 75000
         */
        super(name, 75000);
    }

    // NOT FINISHED!!!!!!!
    public String employeeStatus(){

        /*
        Should return a String representation of this TechnicalEmployee that includes their
        ID, name and how many successful check ins they have had.
        Example: "1 Kasey has 10 successful check ins"
         */
        return super.toString() + " has //THIS NUMBER WILL BE FILLED IN " +
                "BY ANOTHER METHOD IN ANOTHER CLASS// successful check ins";
    }
}

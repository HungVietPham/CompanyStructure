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

        super(name, 75000);
    }

    // NOT FINISHED!!!!!!!
    public String employeeStatus(){

        return super.toString() + " has //THIS NUMBER WILL BE FILLED IN " +
                "BY ANOTHER METHOD IN ANOTHER CLASS// successful check ins";
    }
}

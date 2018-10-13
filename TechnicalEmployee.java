/*******************************************************************************************
 *******************************************************************************************
 *****                            *| TechnicalEmployee |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 1                               *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****employeeStatus(): needs to be able to find out how many check ins employee has ..*****
 *****                      had from the SoftwareEngineer class.                       *****
 *****---------------------------------------------------------------------------------*****
 *****                            Questions on line(s);                                *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****                                     39                                          *****
 *******************************************************************************************
 ******************************************************************************************/

public class TechnicalEmployee extends Employee{


    public TechnicalEmployee(String name){

        /*
            Has a default base salary of 75000
         */

        super(name, 75000);
    }


    public String employeeStatus(){

        /*
            Should return a String representation
            of this TechnicalEmployee that includes
            their ID, name and how many successful check ins
            they have had.
            Example: "1 Kasey has 10 successful check ins"
         */

        // NEED TO BE ABLE TO FIND THE NUMBER OF private int successfulCheckIns FROM SoftwareEngineer.
        return super.toString() + " has [x] successful check ins.";
    }
}

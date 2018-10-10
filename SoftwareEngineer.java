package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                             *| SoftwareEngineer |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 1                               *****
 *******************************************************************************************
 ******************************************************************************************/

public class SoftwareEngineer extends TechnicalEmployee{

    private boolean codeAccess;
    private int checkins;


    public SoftwareEngineer(String name){

        /*
        Should start without access to code and with 0 code check ins
         */
        super(name);
        codeAccess = false;
        checkins = 0;
    }


    public boolean getCodeAccess(){

        /*
        Should return whether or not this SoftwareEngineer has access
        to make changes to the code base
         */
        return codeAccess;
    }


    public void setCodeAccess(boolean access){

        /*
        Should allow an external piece of code to update the SoftwareEngieer's
        code privileges to either true or false
         */
        codeAccess = access;
    }


    public int getSuccessfulCheckins(){

        /*
        Should return the current count of how many times
        this SoftwareEngineer has successfully checked in code
         */
        return checkins;
    }

    // NOT FINISHED!!!!!!!
    public boolean checkinCode(){

        /*
        Should check if this SoftwareEngineer's manager approves of their check in.
        If the check in is approved their successful checkin count should be increased
        and the method should return "true".
        If the manager does not approve the check in the SoftwareEngineer's code access
        should be changed to false and the method should return "false"
         */

        if(codeAccess){
            checkins++;
            return true;
        }else{
            codeAccess = false;
            return false;
        }
    }
}

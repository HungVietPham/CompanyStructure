package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                             *| SoftwareEngineer |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 1                               *****
 *******************************************************************************************
 ******************************************************************************************/

public class SoftwareEngineer extends TechnicalEmployee{

    private boolean hasCodeAccess;
    private int checkins;


    public SoftwareEngineer(String name){

        super(name);
        hasCodeAccess = false;
        checkins = 0;
    }


    public boolean getCodeAccess(){

        return hasCodeAccess;
    }


    public void setCodeAccess(boolean access){

        hasCodeAccess = access;
    }


    public int getSuccessfulCheckins(){

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

        return true;
    }
}

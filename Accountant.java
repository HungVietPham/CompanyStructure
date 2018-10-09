package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                                *| Accountant |*                                 *****
 *****---------------------------------------------------------------------------------*****
 *****                              Unfinished Methods: 4                              *****
 *******************************************************************************************
 ******************************************************************************************/

public class Accountant extends BusinessEmployee{

    private String teamSupported;
    private double bonusBudget;
    private TechnicalLead techLead;


    public Accountant(String name){

        super(name);
        teamSupported = null;
        bonusBudget = 0;
    }


    public void assignTechLead(TechnicalLead techLead){

        this.techLead = techLead;
    }


    public TechnicalLead getTeamSupported(){

        this.techLead = techLead;
        return techLead;
    }

    // NOT FINISHED!!!!!!!
    public void supportTeam(TechnicalLead lead){


    }

    // NOT FINISHED!!!!!!!
    public boolean approveBonus(double bonus){

        /*
        Should take in a suggested bonus amount and check if there is still enough room in the budget.
        If the bonus is greater than the remaining budget, false should be returned, otherwise true.
        If the accountant is not supporting any team false should be returned.
         */

        return true;    // TEMPORARY!!!!!!! JUST TO GET RID OF ERRORS SO MORE CODE CAN BE WRITTEN!!!!!!!
    }

    // NOT FINISHED!!!!!!!!
    public String employeeStatus(){

        return super.employeeStatus() + " is supporting // THIS NAME WILL BE FILLED IN " +
                "BY ANOTHER METHOD IN ANOTHER CLASS //";
    }
}

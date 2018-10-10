package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                              *| TechnicalLead |*                                *****
 *****---------------------------------------------------------------------------------*****
 *****                          Unfinished Methods: STILL CODING!                      *****
 *******************************************************************************************
 ******************************************************************************************/

public class TechnicalLead extends TechnicalEmployee{

    private static int headCount;
    private boolean isManager;
    private double baseSalary;
    private Employee directReports;


    public TechnicalLead(String name){

        /*
        Should create a new TechnicalLead that is a Manager.
        The TechnicalLead's base salary should be 1.3 times that of a TechnicalEmployee.
        TechnicalLeads should have a default head count of 4.
         */

        super(name);
        isManager = true;
        baseSalary = super.getBaseSalary() * 1.3;
        // baseSalary *= 1.3;
        headCount = 4;
    }


    public boolean hasHeadCount(){

        /*
        Should return true if the number of direct reports this manager
        has is less than their headcount.
         */

        // return (directReports < headCount);
        return true;          // TEMPORARY VALUE TO GET RID OF ERRORS!!!!!!!!!!!!

    }


    public boolean addReport(SoftwareEngineer e){

        /*
        Should accept the reference to a SoftwareEngineer object,
        and if the TechnicalLead has head count left should add this employee
        to their list of direct reports.
        If the employee is successfully added to the TechnicalLead's direct reports
        true should be returned, false should be returned otherwise
         */

        if(1 < headCount)
            return true;      // TEMPORARY VALUE TO GET RID OF ERRORS!!!!!!!!!
        return false;         // TEMPORARY VALUE TO GET RID OF ERRORS!!!!!!!!!
    }


    public boolean approveCheckin(SoftwareEngineer e){

        /*
        Should see if the employee passed in does report to this manager
        and if their code access is currently set to "true".
        If both those things are true, true is returned, otherwise false is returned
         */

        return true;     // TEMPORARY VALUE TO GET RID OF ERRORS!!!!!!!!!!!!
    }


    public boolean requestBonus(Employee e, double bonus){

        /*
        Should check if the bonus amount requested would be approved by the BusinessLead
        supporting this TechnicalLead.
        If it is, that employee should get that bonus and
        true should be returned. False should be returned otherwise
         */

        return true;    // TEMPORARY VALUE TO GET RID OF ERRORS!!!!!!!!!!!!!!!!
    }


    public String getTeamStatus(){

        /*
        Should return a String that gives insight into this Manager
        and all their direct reports.
        It should return a string that is a combination of
        the TechnicalLead's employee status followed by
        each of their direct employee's status on subsequent lines.
        If the TechnicalLead has no reports it should print their employee status
        followed by the text " and no direct reports yet ".
        Example: "10 Kasey has 5 successful check ins and no direct reports yet".
        If the TechnicalLead does have reports it might look something like
        "10 Kasey has 5 successful check ins and is managing: /n 5 Niky has 2 successful check ins"
         */

        return "";     // TEMPORARY VALUE TO GET RID OF ERRORS!!!!!!!!!!!!!!!
    }
}

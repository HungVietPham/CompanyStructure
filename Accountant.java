import java.util.ArrayList;

/*******************************************************************************************
 *******************************************************************************************
 *****                                *| Accountant |*                                 *****
 *****---------------------------------------------------------------------------------*****
 *****                              Unfinished Methods: 5                              *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****                           public Accountant(String name)                        *****
 *****                  public void setTeamSupported(TechnicalLead lead)               *****
 *****                          public String employeeStatus()                         *****
 *****---------------------------------------------------------------------------------*****
 *****                            Questions on line(s);                                *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****                 22 - 23, 34, 36 - 37, 70 - 71, 73, 75 - 76, 107                 *****
 *******************************************************************************************
 ******************************************************************************************/

public class Accountant extends BusinessEmployee{

    private TechnicalLead teamSupported;                                   // DO I NEED?
    private ArrayList<TechnicalLead> directReports = new ArrayList<>();    // DO I NEED?


    public Accountant(String name){

        /*
            Should start with a bonus budget of 0
            and no team they are officially supporting
         */

        super(name);
        super.setBonusBudget(0);    // DO I NEED A DIFFERENT private double bonusBudget (from

        teamSupported = null;    // DO I NEED TechnicalLead teamSupported OR ArrayList<TechnicalLead> directReports
                                     // SHOULD I USE private Employee manager FROM Employee?
    }


    public TechnicalLead getTeamSupported(){

        /*
            Should return a reference to the TechnicalLead
            that this Accountant is currently supporting.
            If they have not been assigned a TechnicalLead
            null should be returned
         */

        if(teamSupported == null)
            return null;
        else
            return teamSupported;
    }


    public void setTeamSupported(TechnicalLead lead){

        /*
            Should allow a reference to a TechnicalLead
            to be passed in and saved. Once this happens
            the Accountant's bonus budget should be updated
            to be the total of each SoftwareEngineer's base salary
            that reports to that TechnicalLead plus 10%.
            For example, if the TechnicalLead supports 2 SoftwareEngineers,
            each with a salary of 75000, the Accountant's budget
            should be 150000 + 15000 for a total of 165000
         */

         teamSupported = lead;       // WHICH ONE? OR BOTH?
         directReports.add(lead);    // WHICH ONE? OR BOTH?

        // super.setManager(lead);     // IS THERE A WAY TO DO THIS?

        super.setBonusBudget((directReports.size() * 75000) * 1.1);    // A WAY TO GET softwareEngineers baseSalary?
    }                                                                      // baseSalary FROM Employee .


    public boolean approveBonus(double bonus){

        /*
            Should take in a suggested bonus amount and check
            if there is still enough room in the budget.
            If the bonus is greater than the remaining budget,
            false should be returned, otherwise true.
            If the accountant is not supporting any team
            false should be returned.
         */

        if((teamSupported == null) || (bonus > super.getBonusBudget()))
            return false;
        else
            return true;
    }


    public String employeeStatus(){

        /*
            Should return a String representation of this Accountant
            that includes their ID, name, the size of their
            currently managed budget and the name of the TechnicalLead
            they are currently supporting. Example:
            "1 Kasey with a budget of 22500.0 is supporting Satya Nadella"
         */

        return super.employeeStatus() + " is supporting " + teamSupported;    // teamSupported OR directReports?
    }
}

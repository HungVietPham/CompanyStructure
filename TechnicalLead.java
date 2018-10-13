/*******************************************************************************************
 *******************************************************************************************
 *****                              *| TechnicalLead |*                                *****
 *****---------------------------------------------------------------------------------*****
 *****                            Unfinished Methods: ALL                              *****
 *****---------------------------------------------------------------------------------*****
 *****                            Questions on line(s);                                *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****             28 - 29, 45 - 48, 50 - 52, 74 - 75, 94 - 96, 124 - 126              *****
 *******************************************************************************************
 ******************************************************************************************/

public class TechnicalLead extends TechnicalEmployee{

    private int headCount;


    public TechnicalLead(String name){

        /*
            Should create a new TechnicalLead that is a Manager.
            The TechnicalLead's base salary should be
            1.3 times that of a TechnicalEmployee.
            TechnicalLeads should have a default head count of 4.
         */

        super(name);
        // HOW TO MAKE A TechnicalLead THAT IS A MANAGER?
        // HOW TO SET BASE SALARY EQUAL TO "1.3 TIMES THAT OF A TechnicalEmployee?
        headCount = 4;
        super.setBaseSalary(super.getBaseSalary() * 1.3);
    }


    public boolean hasHeadCount(){

        /*
            Should accept the reference to a SoftwareEngineer object,
            and if the TechnicalLead has head count left
            should add this employee to their list of direct reports.
            If the employee is successfully added to
            the TechnicalLead's direct reports
            true should be returned, false should be returned otherwise
         */

        // DO I NEED TO ADD A PARAMETER OF TYPE SoftwareEngineer? INSTRUCTIONS HAVE BEEN GIVING WHAT PARAMETERS ....
            // YOU SHOULD HAVE FOR EACH METHOD. THIS METHOD HEADER IS EXACTLY WHAT WAS WRITTEN IN INSTRUCTIONS.
        // HOW TO GET TeamSupported OR ArrayList<TechnicalLead> directReports AND ALTER THEM/IT? BOTH FROM Accountant...
            // OR manager FROM Employee? I AM CONFUSED ON WHICH VARIABLE I NEED ACCESS TO AND HOW TO ACCESS IT.

        // HOW I WOULD CODE THIS IF I HAD ACCESS TO ArrayList<TechnicalLead> directReports from Accountant ....
            // NOT SURE IF ArrayList<TechnicalLead> directReports SHOULD EVEN EXIST OR IF I SOMEHOW NEED TO ....
            // DO EVERYTHING WITH THE private Employee manager VARIABLE FROM Employee.
        // if(headCount < directReports.size()) {
        //     directReports.add(this);
        //     return true;
        // }else
        //     return false;



        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }


    public boolean approveCheckin(SoftwareEngineer e){

        /*
            Should see if the employee passed in does report to this manager
            and if their code access is currently set to "true".
            If both those things are true, true is returned,
            otherwise false is returned
         */

        // HOW TO: CHECK IF "the employee passed in does report to this manager"?
        // HOW TO: GET private boolean codeAccess FROM SoftwareEngineer?



        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }


    public boolean requestBonus(Employee e, double bonus){

        /*
            Should check if the bonus amount requested
            would be approved by the BusinessLead
            supporting this TechnicalLead. If it is,
            that employee should get that bonus
            and true should be returned.
            False should be returned otherwise
         */

        // HOW TO MAKE SURE THE CORRECT BusinessLead IS APPROVING THE BONUS?
        // HOW TO GIVE BONUS TO EMPLOYEE AND WHAT VARIABLE/VALUE SHOULD BE UPDATED?
            // e.setBaseSalary(e.getBaseSalary + bonus)?
        // if(condition){

        //     return true;
        // }else
        //     return false;


        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }


    public String getTeamStatus(){

        /*
            Should return a String that gives insight into
            this Manager and all their direct reports.
            It should return a string that is a combination
            of the TechnicalLead's employee status
            followed by each of their direct employee's status
            on subsequent lines. If the TechnicalLead has no reports
            it should print their employee status followed by the text
            " and no direct reports yet ". Example:
            "10 Kasey has 5 successful check ins and no direct reports yet".
            If the TechnicalLead does have reports it might look something like
            "10 Kasey has 5 successful check ins and is managing: /n 5 Niky has 2 successful check ins"
         */

        // HOW TO CHECK IF THIS MANAGER HAS ANY DIRECT REPORTS?
        // HOW TO DO THE PART: "\n 5 Nicky has 2 successful check ins."? THIS TechnicalLead COULD HAVE MULTIPLE
            // EMPLOYEES DIRECT REPORTING TO THEM.



        // STRING TO BE RETURNED IF NO DIRECT REPORTS YET.
        return super.employeeStatus() + " and no direct reports yet.";
    }
}

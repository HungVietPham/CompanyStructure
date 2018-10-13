/*******************************************************************************************
 *******************************************************************************************
 *****                               *| BusinessLead |*                                *****
 *****---------------------------------------------------------------------------------*****
 *****                             Unfinished Methods: ALL                             *****
 *****---------------------------------------------------------------------------------*****
 *****                            Questions on line(s);                                *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****                   26 - 27, 40, 64 - 69, 88 - 93, 111 - 116                      *****
 *******************************************************************************************
 ******************************************************************************************/

public class BusinessLead extends BusinessEmployee{




    public BusinessLead(String name){

        /*
            Should create a new BusinessLead that is a Manager.
            The BusinessLead's base salary should be twice that
            of an Accountant. They should start with a head count of 10.
         */

        // HOW TO ACCESS AND ALTER private int headCount INSIDE CLASS TechnicalLead?
        // HOW TO SET private double baseSalary TO TWICE THAT OF AN ACCOUNTANT?
        super(name);
        super.setBaseSalary(super.getBaseSalary() * 2);
    }


    public boolean hasHeadCount(){

        /*
            Should return true if the number of direct reports
            this manager has is less than their headcount.
         */

        //   HOW TO ACCESS VALUE OF private int headCount INSIDE CLASS TechnicalLead?



        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }


    public boolean addReport(Accountant e, TechnicalLead supportTeam){

        /*
            Should accept the reference to an Accountant object,
            and if the BusinessLead has head count left
            should add this employee to their list of direct reports.
            If the employee is successfully added to the BusinessLead's direct reports
            true should be returned, false should be returned otherwise.
            Each time a report is added the BusinessLead's bonus budget
            should be increased by 1.1 times that new employee's base salary.
            That employee's team they are supporting should be updated
            to reflect the reference to the TechnicalLead given.
            If the employee is successfully added
            true should be returned, false otherwise.
         */

        // HOW TO ACCESS private int headCount INSIDE CLASS TechnicalLead?
        // HOW TO ACCESS ArrayList<TechnicalLead> directReports INSIDE CLASS Accountant?
        // HOW TO KNOW WHAT TYPE OF EMPLOYEE WAS ADDED TO THE BusinessLead'S LIST OF directReports
            // AND SET THEIR private double baseSalary FROM INSIDE CLASS Employee?
        // HOW TO: "That employee's team they are supporting should be updated
            // to reflect the reference to the TechnicalLead given"?



        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }


    public boolean requestBonus(Employee e, double bonus){

        /*
            Should check if the bonus amount requested would fit
            in current BusinessLead's budget. If it is,
            that employee should get that bonus,
            the BusinessLeader's budget should be deducted
            and true should be returned.
            False should be returned otherwise
         */

        // HOW TO: "check if the bonus amount requested would fit in current BusinessLead's budget"?
            // private double bonusBudget IS INSIDE CLASS BusinessEmployee.
        // SHOULD BONUS BE ADDED TO EMPLOYEE'S private double bonusBudget INSIDE THE CLASS BusinessEmployee
            // OR EMPLOYEE'S private double baseSalary INSIDE CLASS Employee?
        // HOW TO: "the BusinessLeader's budget should be deducted"?
            // ONCE AGAIN ... bonusBudget OR baseSalary?



        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }


    public boolean approveBonus(Employee e, double bonus){

        /*
            This function should look through the Accountants the BusinessLead manages,
            and if any of them are supporting a the TechnicalLead that is the manager
            of the Employee passed in then the Accountant's budget should be consulted
            to see if the bonus could be afforded. If the team can afford the bonus
            it should be rewarded and true returned, false otherwise
         */

        // HOW TO: "look through the Accountants the BusinessLead manages"?
        // HOW TO CHECK IF: "any of them are supporting the TechnicalLead that is the manager ... "
            // " ... of the Employee passed in"?
        // HOW TO: "the Accountant's budget should be consulted to see if the bonus could be afforded"?
            // ONCE AGAIN ... private double bonusBudget OR private double baseSalary?
        // HOW TO: "If the team can afford the bonus, it should be rewarded".



        return false;    // TEMPORARY VALUE TO CLEAR ERRORS!!!!!!!
    }
}

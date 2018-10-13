/*******************************************************************************************
 *******************************************************************************************
 *****                             *| SoftwareEngineer |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 1                               *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****     checkinCode(): I think is finished, but would like someone to review.       *****
 *****---------------------------------------------------------------------------------*****
 *****                            Questions on line(s);                                *****
 *****  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -  *****
 *****                             82 - 85, 89 - 90                                    *****
 *******************************************************************************************
 ******************************************************************************************/

public class SoftwareEngineer extends TechnicalEmployee{

    private boolean codeAccess;
    private int successfulCheckIns;


    public SoftwareEngineer(String name){

        /*
            Should start without access to code and with 0 code check ins
         */

        super(name);
        codeAccess = false;
        successfulCheckIns = 0;
    }


    public boolean getCodeAccess(){

        /*
            Should return whether or not
            this SoftwareEngineer has access
            to make changes to the code base
         */

        return codeAccess;
    }


    public void setCodeAccess(boolean access){

        /*
            Should allow an external piece of code
            to update the SoftwareEngineer's
            code privileges to either true or false
         */

        this.codeAccess = access;
    }


    public int getSuccessfulCheckIns(){

        /*
            Should return the current count
            of how many times this SoftwareEngineer
            has successfully checked in code
         */

        return successfulCheckIns;
    }


    public boolean checkinCode(){

        /*
            Should check if this SoftwareEngineer's manager approves
            of their check in. If the check in is approved
            their successful checkIn count should be increased
            and the method should return "true".
            If the manager does not approve the check in
            the SoftwareEngineer's code access
            should be changed to false
            and the method should return "false"
         */

        // IS CHECKING THE VALUE OF private boolean codeAccess THE SAME AS CHECKING WHETHER ....
            // "this SoftwareEngineer's manager approves of their check in."
        // IF IT IS THE SAME, WHY WOULD I NEED TO: "if the manager does not approve the check in,
            // the SoftwareEngineer's code access should be changed to false"?



        // DOES THIS CODE SATISFY THE INSTRUCTIONS? DO I NEED TO USE getCodeAccess() TO GET private boolean codeAccess
            // OR CAN I JUST USE THE VARIABLE NAME "codeAccess"?
        if(getCodeAccess()){
            successfulCheckIns++;
            return true;
        }else{
            setCodeAccess(false);
            return false;
        }
    }
}

/*******************************************************************************************
 *******************************************************************************************
 *****                             *| SoftwareEngineer |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 0                               *****
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
        checkins = 0;
        codeAccess = false;
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
            Should allow an external piece of code
            to update the SoftwareEngineer's code privileges
            to either true or false
         */

        this.codeAccess = access;
    }


    public int getSuccessfulCheckins(){

        /*
            Should return the current count of
            how many times this SoftwareEngineer has
            successfully checked in code
         */

        return checkins;
    }


    public boolean checkinCode(){

        /*
            Should check if this SoftwareEngineer's manager approves of
            their check in. If the check in is approved
            their successful checkin count should be
            increased and the method should return "true".
            If the manager does not approve the check in
            the SoftwareEngineer's code access should be
            changed to false and the method should return "false"
         */

        if(codeAccess){
            checkins++;
            return true;
        }else {
             // codeAccess = false;
            return false;
        }
    }


























































//public class SoftwareEngineer extends TechnicalEmployee{

//    private boolean codeAccess;
//    protected double bonus;


//    public SoftwareEngineer(String name){

//        /*
//        Should start without access to code and with 0 code check ins
//         */
//        super(name);
//        super.setCheckins(0);
//        codeAccess = false;
//    }


//    public void setCodeAccess(boolean access){

//        /*
//        Should allow an external piece of code to update the SoftwareEngineer's
//        code privileges to either true or false
//         */
//        this.codeAccess = access;
//    }


//    public boolean getCodeAccess(){

//        /*
//        Should return whether or not this SoftwareEngineer has access
//        to make changes to the code base
//         */
//        return codeAccess;
//    }


//    public int getSuccessfulCheckins(){

//        /*
//        Should return the current count of how many times
//        this SoftwareEngineer has successfully checked in code
//         */
//        return super.getCheckins();
//    }


//    public boolean checkinCode(){

//        /*
//        Should check if this SoftwareEngineer's manager approves of their check in.
//        If the check in is approved their successful checkin count should be increased
//        and the method should return "true".
//        If the manager does not approve the check in the SoftwareEngineer's code access
//        should be changed to false and the method should return "false"
//         */

//        if(codeAccess){
//            super.setCheckins(super.getCheckins() + 1);
//            return true;
//        }else{
//            codeAccess = false;
//            return false;
//        }
//    }
}
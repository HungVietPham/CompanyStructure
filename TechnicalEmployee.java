/*******************************************************************************************
 *******************************************************************************************
 *****                            *| TechnicalEmployee |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             UNFINISHED METHODS: 0                               *****
 *******************************************************************************************
 ******************************************************************************************/

public class TechnicalEmployee extends Employee{

   // private int checkins;


    public TechnicalEmployee(String name){

        /*
            Has a default base salary of 75000
         */

        super(name, 75000);
    }


    public String employeeStatus(){

        /*
            Should return a String representation of this TechnicalEmployee
            that includes their ID, name and how many successful check ins
            they have had.
            Example: "1 Kasey has 10 successful check ins"
         */

        return super.toString() + " has ";    //    +  (SoftwareEngineer).getSuccessfulCheckins() +  + " successful check ins.";
    }


///////// ADDITIONAL METHODS WRITTEN BY ME. TRY TO CUT THESE OUT WHEN PROJECT IS FINISHED ///////////


//    public int getCheckins(){

//        /*
//            Added by me: so that outside classes can get
//            the number of successful check ins.
//         */

//        return checkins;
//    }


//    public void setCheckins(int checkins){

//        /*
//            Added by me: so that outside classes can set
//            the number of successful check ins.
//         */

//        this.checkins = checkins;
//    }













































//public class TechnicalEmployee extends Employee{

//    private int checkins;


//    public TechnicalEmployee(String name){

//        /*
//        Has a default base salary of 75000
//         */
//        super(name, 75000);
//    }


//    public int getCheckins(){

//        /*
//        Added by me to return number of successful checkins.
//         */
//        return checkins;
//    }


//    public void setCheckins(int checkins){

//        /*
//        Added by me to set the number of checkins.
//         */
//        this.checkins = checkins;
//    }


//    public String employeeStatus(){

//        /*
//        Should return a String representation of this TechnicalEmployee that includes their
//        ID, name and how many successful check ins they have had.
//        Example: "1 Kasey has 10 successful check ins"
//         */
//        return super.toString() + " has  " + checkins + " successful check ins.";
//    }
}
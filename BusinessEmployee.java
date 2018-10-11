/*******************************************************************************************
 *******************************************************************************************
 *****                             *| BusinessEmployee |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****                             Unfinished Methods: 1                               *****
 *******************************************************************************************
 ******************************************************************************************/

public class BusinessEmployee extends Employee{

    private double bonusBudget;


    public BusinessEmployee(String name){

        /*
            Has a default salary of 50000
         */

        super(name, 50000);
    }


    public double getBonusBudget(){

        /*
            Should establish a running tally of the remaining bonusBudget
            for the team this employee supports.
            How that budget is determined
            will depend on which type of Business Employee it is
         */

        return bonusBudget;
    }


    public String employeeStatus(){

        /*
            Should return a String representation of this BusinessEmployee
            that includes their ID, name and the size
            of their currently managed budget.
            Example: "1 Kasey with a budget of 22500.0"
         */

        return super.toString() + " with a budget of " + bonusBudget;
    }


    ///////// ADDITIONAL METHODS WRITTEN BY ME. TRY TO CUT THESE OUT WHEN PROJECT IS FINISHED ///////////


    public void setBonusBudget(double budget){

        /*
            Added by me: so outside classes can set the value of bonusBudget.
         */

        this.bonusBudget = budget;
    }



























































//public class BusinessEmployee extends Employee{
//    //NOT FINISHED!!!!!!!
//    private double bonusBudget;
//    // private static double teamBonusBudget;       // To use with entire team's budget. NOT IMPLEMENTED!


//    public BusinessEmployee(String name){

//        /*
//        Has a default salary of 50000
//         */
//        super(name, 50000);
//    }

//    // NOT FINISHED YET!!!!!!!
//    public double getBonusBudget(){

//        /*
//        Should establish a running tally of the remaining bonusBudget for
//        the team this employee supports.
//        How that budget is determined will depend on which type of Business Employee it is
//         */
//        return bonusBudget;
//    }


//    public void setBonusBudget(double bonusBudget){

//        /*
//        Added by me to set bonusBudget.
//         */
//        this.bonusBudget = bonusBudget;
//    }


//    public String employeeStatus(){

//        /*
//        Should return a String representation of this BusinessEmployee that includes their
//        ID, name and the size of their currently managed budget.
//        Example: "1 Kasey with a budget of 22500.0"
//         */
//        return super.toString() + " with a budget of " + bonusBudget;
//    }
}
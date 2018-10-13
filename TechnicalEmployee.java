package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                            *| TechnicalEmployee |*                              *****
 *******************************************************************************************
 ******************************************************************************************/

public class TechnicalEmployee extends Employee{

    private int successCheckIns;


    public TechnicalEmployee(String name){
        super(name, 75000);
    }


    @Override
    public String employeeStatus() {
        return this.toString() + " has " + this.successCheckIns + " successful check ins";
    }


    public int getSuccessCheckIns() {
        return this.successCheckIns;
    }


    public void setSuccessCheckIns(int successCheckIns) {
        this.successCheckIns = successCheckIns;
    }
}

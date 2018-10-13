package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                             *| SoftwareEngineer |*                              *****
 *******************************************************************************************
 ******************************************************************************************/

public class SoftwareEngineer extends TechnicalEmployee {

    private boolean accessCode;


    public SoftwareEngineer(String name) {
        super(name);
        this.accessCode = false;
        this.setSuccessCheckIns(0);
    }


    public boolean getCodeAccess() {
        return this.accessCode;
    }


    public void setCodeAccess(boolean access) {
        this.accessCode = access;
    }


    public int getSuccessfulCheckIns() {
        return this.getSuccessCheckIns();
    }


    public boolean checkInCode() {
        boolean isApprove = ((TechnicalLead) getManager()).approveCheckIn(this);
        if (isApprove) {
            this.setSuccessCheckIns(getSuccessfulCheckIns() + 1);
            return true;
        }else{
            return false;
        }
    }
}

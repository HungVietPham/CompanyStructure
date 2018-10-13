package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                             *| BusinessEmployee |*                              *****
 *******************************************************************************************
 ******************************************************************************************/

// IMPORTS of needed tools and plug-ins.
import java.text.DecimalFormat;

public class BusinessEmployee extends Employee {

    private double bonusBudget;


    public BusinessEmployee(String name) {
        super(name, 50000);
    }


    @Override
    public String employeeStatus() {
        String budNum = String.valueOf(getBonusBudget());
        String pattern = "#,###.00";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        budNum = myFormatter.format(Double.parseDouble(budNum));

        return this.getEmployeeID()  +  " "  + getName()  + " with a budget of $" + budNum;
    }


    public double getBonusBudget() {
        return this.bonusBudget;
    }


    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }
}

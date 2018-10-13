package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                                *| Accountant |*                                 *****
 *******************************************************************************************
 ******************************************************************************************/

// IMPORTS of needed tools and plug-ins.
import java.text.DecimalFormat;

public class Accountant extends BusinessEmployee {

    private TechnicalLead suppTeam;


    public Accountant(String name) {
        super(name);
        setBonusBudget(0);
        this.suppTeam = null;
    }


    public TechnicalLead getTeamSupported() {
        return this.suppTeam;
    }


    public void supportTeam(TechnicalLead lead) {
        double sum = 0;
        this.suppTeam = lead;
        for (SoftwareEngineer eng : suppTeam.getDirectReport()) {
            sum += eng.getBaseSalary();
        }

        setBonusBudget(sum + sum * 0.10);
    }


    public boolean approveBonus(double bonus) {
        if (bonus > getBonusBudget() || suppTeam == null) {
            return false;
        }
        return true;
    }


    public String employeeStatus(){
        String budNum = String.valueOf(getBonusBudget());
        String pattern = "#,###.00";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        budNum = myFormatter.format(Double.parseDouble(budNum));

        return this.getEmployeeID()  +  " "  + getName() + " with a budget of $" + budNum + " is supporting " + getTeamSupported();
    }
}

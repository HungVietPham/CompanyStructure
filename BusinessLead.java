package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                               *| BusinessLead |*                                *****
 *******************************************************************************************
 ******************************************************************************************/

// IMPORTS of needed tools and plug-ins.
import java.util.ArrayList;
import java.util.List;

public class BusinessLead extends BusinessEmployee {

    private int headCount;
    private List<Accountant> directReport;


    public BusinessLead(String name) {
        super(name);
        setManager(this);
        setBaseSalary(getBaseSalary() * 2);
        this.headCount = 10;
        directReport = new ArrayList<>();
    }


    public boolean hasHeadCount() {
        return directReport.size() < this.headCount;
    }


    public boolean addReport(Accountant acc, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            directReport.add(acc);
            acc.supportTeam(supportTeam);
            acc.setManager(this);
            setBonusBudget(getBonusBudget() + (acc.getBaseSalary() * 1.1));
            return true;
        }
        return false;
    }


    public boolean approveBonus(Employee lead, double bonus) {
        for (Accountant acc : directReport) {
            if (acc.getTeamSupported().equals(lead)) {
                if (acc.approveBonus(bonus)) {
                    return true;
                }
            }
        }
        return false;
    }


    public String getTeamStatus() {
        StringBuilder sb = new StringBuilder();
        if (!directReport.isEmpty()) {
            sb.append(this.employeeStatus()).append(" and is managing:");
            for (Accountant acc : directReport) {
                sb.append("\n" + acc.employeeStatus());
            }
            return sb.toString();
        }
        return this.employeeStatus() + " and no direct reports yet";
    }
}

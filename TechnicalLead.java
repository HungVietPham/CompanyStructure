package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                              *| TechnicalLead |*                                *****
 *******************************************************************************************
 ******************************************************************************************/

// IMPORTS of needed tools and plug-ins.
import java.util.ArrayList;
import java.util.List;

public class TechnicalLead extends TechnicalEmployee {

    private int headCount;
    private List<SoftwareEngineer> directReport;


    public TechnicalLead(String name) {
        super(name);
        this.setManager(this);
        this.setBaseSalary(this.getBaseSalary() * 1.3);
        this.headCount = 4;
        directReport = new ArrayList<>();
    }


    public boolean hasHeadCount() {
        if (directReport.size() < headCount) {
            return true;
        }
        return false;
    }


    public boolean addReport(SoftwareEngineer softEng) {
        if (hasHeadCount()) {
            directReport.add(softEng);
            softEng.setManager(this);
            return true;
        }
        return false;
    }


    public boolean approveCheckIn(SoftwareEngineer softEng) {
        if (directReport.contains(softEng) && softEng.getCodeAccess()) {
            return true;
        }
        return false;
    }


    public boolean requestBonus(Employee accountant, double bonus) {
        return ((Accountant)accountant).approveBonus(bonus);
    }


    public String getTeamStatus() {
        StringBuilder sb = new StringBuilder();
        if (!directReport.isEmpty()) {
            sb.append(this.employeeStatus()).append(" and is managing:");
            for (SoftwareEngineer eng : directReport) {
                sb.append("\n" + eng.employeeStatus());
            }
            sb.append("\n");
            return sb.toString();
        }
        return this.employeeStatus() + " and no direct reports yet \n";
    }


    public List<SoftwareEngineer> getDirectReport() {
        return directReport;
    }
}

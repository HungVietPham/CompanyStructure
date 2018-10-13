package com.github.khardrix.companyStructure;

/*******************************************************************************************
 *******************************************************************************************
 *****                            *| Company Structure |*                              *****
 *****---------------------------------------------------------------------------------*****
 *****          For this project you are going to practice using inheritance,          *****
 *****        interfaces and abstract classes to relate objects to one another.        *****
 *****          The following is a description of each class and its behavior.         *****
 *****             It is up to you to decide which classes should extend,              *****
 *****        implement or abstract which pieces to maximize your code sharing.        *****
 *****---------------------------------------------------------------------------------*****
 *****     Create an object ecosystem that includes each of the following classes:     *****
 *****-   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -*****
 *****                                    Employee                                     *****
 *****                               TechnicalEmployee                                 *****
 *****                                BusinessEmployee                                 *****
 *****                                SoftwareEngineer                                 *****
 *****                                   Accountant                                    *****
 *****                                 TechnicalLead                                   *****
 *****                                  BusinessLead                                   *****
 *******************************************************************************************
 ******************************************************************************************/

public class CompanyStructure {

    public static void main(String[] args) {
        TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        seA.setCodeAccess(true);
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);
        seC.setSuccessCheckIns(3);
        System.out.println(seC.getCodeAccess());
        System.out.println(seA.checkInCode());
        System.out.println(CTO.getTeamStatus());


        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Gizan");
        SoftwareEngineer seG = new SoftwareEngineer("Zaynah");
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);
        System.out.println(VPofENG.getTeamStatus());

        BusinessLead CFO = new BusinessLead("Amy Hood");
        Accountant actA = new Accountant("Niky");
        Accountant actB = new Accountant("Andrew");
        actB.supportTeam(VPofENG);
        System.out.println(actB.approveBonus(330001));
        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);
        System.out.println(CTO.requestBonus(actA, 247500));
        System.out.println(CFO.getTeamStatus());
        System.out.println(CFO.approveBonus(VPofENG,100000));
        System.out.println(CFO.getTeamStatus());
    }
}

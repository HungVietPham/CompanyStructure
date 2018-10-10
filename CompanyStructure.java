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

//IMPORTS of needed tools and plug-ins.


public class CompanyStructure {


    public static void main(String[] args){

        Employee employee1 = new TechnicalEmployee("Ryan");
        Employee employee2 = new TechnicalEmployee("Carmen");
        Employee employee3 = new TechnicalEmployee("Bella");
        Employee employee4 = new TechnicalEmployee("Brandon");
        Employee employee5 = new TechnicalEmployee("Jen");
        Employee employee6 = new BusinessEmployee("Bandit");
        TechnicalEmployee employee7 = new SoftwareEngineer("Black Shepard");
        TechnicalLead employee8 = new TechnicalLead("Bob");

        System.out.println(employee1.getName());
        System.out.println("$" + employee1.getBaseSalary());
        System.out.println(employee1.equals(employee1));
        System.out.println(employee2.toString());
        System.out.println(employee3.equals(employee4));
        System.out.println(employee5.toString());
        System.out.println(employee1.employeeStatus());
        System.out.println(employee6.employeeStatus());
        System.out.println(employee7.employeeStatus());
        System.out.println(((SoftwareEngineer) employee7).getCodeAccess());
        ((SoftwareEngineer) employee7).setCodeAccess(true);
        System.out.println(((SoftwareEngineer) employee7).getCodeAccess());
        System.out.println(employee8.getBaseSalary());
    }
}

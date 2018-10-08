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

        Employee employee1 = new Employee("Ryan", 31000);
        Employee employee2 = new Employee("Ryan", 31000);
        Employee employee3 = new Employee("Ryan", 31000);
        Employee employee4 = new Employee("Ryan", 31000);
        Employee employee5 = new Employee("Ryan", 31000);


        System.out.println(employee1.getName());
        System.out.println("$" + employee1.getBaseSalary());
        System.out.println(employee1.getEmployeeID());
        System.out.println(employee3.getEmployeeID());
        System.out.println(employee5.getEmployeeID());



    }
}

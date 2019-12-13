/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        
        Employee employee = new Employee();
        employee.setName("Hemant");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        
        account.setEmployee(employee);
       
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        
        //Doctor
        Employee employee1 = new Employee();
        employee1.setName("Vijay");
        
        UserAccount account1 = new UserAccount();
        account1.setUsername("doctor");
        account1.setPassword("doctor");
        account1.setRole("Doctor");
        
        account1.setEmployee(employee1);
       
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee1);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        
        //Lab
        Employee employee2 = new Employee();
        employee2.setName("Ramesh");
        
        UserAccount account2 = new UserAccount();
        account2.setUsername("lab");
        account2.setPassword("lab");
        account2.setRole("Lab");
        
        account2.setEmployee(employee2);
       
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee2);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        
        
        
        
        return business;
    }
    
}

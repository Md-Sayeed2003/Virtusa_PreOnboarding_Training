package Day3.company.hr;

import Day3.company.Company;


public class HR extends Company {

    public void showHRAccess(){

        System.out.println("Showing Details from HR class");
        System.out.println("Company Name : "+companyName);
        System.out.println("Total Employees : "+totalEmployees);
        System.out.println("Location : Not Accessible ");
        System.out.println("Revenue : Not Accessible");

    }
}

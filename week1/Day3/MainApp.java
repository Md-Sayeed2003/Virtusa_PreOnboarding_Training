package Day3;

import Day3.company.Employee;
import Day3.company.hr.HR;

public class MainApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"Jhon");

        HR h1 = new HR();

//        System.out.println("Employee Name : "+ emp1.name);  --> Not accessible outside the package

        emp1.showEmployeeDetails();

        System.out.println();
        h1.showHRAccess();
        

    }

}

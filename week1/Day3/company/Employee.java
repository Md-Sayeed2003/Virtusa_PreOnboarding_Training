package Day3.company;

public class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showEmployeeDetails(){
        System.out.println("Id : "+id +" Name : "+name);

        System.out.println(Company.companyName);
        System.out.println(Company.totalEmployees);
        System.out.println(Company.location);

        // Access modifier of revenue is private so we cannot access outside the class
    }

}

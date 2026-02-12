package Day3.company;

public class Company {

    public static String companyName;
    protected static int totalEmployees;
    static String location;
    private static double revenue;

    static {
        companyName = "Virtusa";
        totalEmployees = 2000;
        location = "Chennai";
        revenue = 1200000;
    }

    public static void showCompanyDetails(){
        System.out.println("CompanyName : "+companyName);
        System.out.println("Total Employees : "+totalEmployees);
        System.out.println("Location : "+location);
        System.out.println("Revenue : "+revenue);
    }

    protected static int getTotalEmployees(){
        return totalEmployees;
    }

    private static double getRevenue(){
        return revenue;
    }



}

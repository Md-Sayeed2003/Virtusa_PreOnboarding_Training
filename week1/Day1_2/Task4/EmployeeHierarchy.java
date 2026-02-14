package Task4;

public class EmployeeHierarchy {

    public static void main(String[] args) {

        Developer dev = new Developer("Alex", 101);
        Tester tester = new Tester("Aman", 102);

        dev.work();
        dev.code();

        System.out.println();

        tester.work();
        tester.test();
    }
}

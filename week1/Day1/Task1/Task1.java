public class Task1 {

    static class Employee{

        int salary;

        Employee(int salary){
            this.salary = salary;
        }

        void hra(){
            System.out.println("HRA = Rs : "+salary*0.2);
        }

        void da(){
            System.out.println("DA = Rs : "+salary*0.1);
        }

        void gross(){
            double gs = salary + salary*0.2 + salary*0.1;
            System.out.println("Gross salary : " +gs );
        }

    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(20000);
        emp1.da();
        emp1.hra();
        emp1.gross();


        Employee emp2 = new Employee(40000);
        emp2.da();
        emp2.hra();
        emp2.gross();


    }
}

package Task4;

public class Developer extends Employee {


    Developer(String name, int id) {
        super(name, id);
    }

    void code(){
        System.out.println(name +" is writing code.");
    }
}

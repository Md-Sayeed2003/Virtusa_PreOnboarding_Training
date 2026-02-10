package Task2;

public class Student {

    private int id;
    private String name;
    private int marks;

    public Student(){

    }

    public Student(int id, String salary, int marks) {
        this.id = id;
        this.name = salary;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public void getDetails() {
        System.out.println("Id : "+id + " Name : "+name+ " Marks : "+marks) ;
    }

    public String calculateGrade(){
        if (marks>=90)
            return "A grade";
        else if( marks >= 80)
            return "B grade";
        else if( marks >= 70)
            return "C grade";
        else if( marks >= 60)
            return "D grade";
        else if( marks >= 50)
            return "E grade";
        else
            return "Fail";


    }
}

package Task2;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(1,"Jhon",82);
        s1.getDetails();
        System.out.println(s1.calculateGrade());


        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Alex");
        s2.setMarks(52);


        Student s3 = new Student(3,"Bob",78);
        s3.getDetails();

        s3.setId(4);
        s3.setName("Bob the builder");
        s3.setMarks(89);

        System.out.println();

        s3.getDetails();
    }

}

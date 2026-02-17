package Java_Project.com.mile1.main;

import Java_Project.com.mile1.bean.Student;
import Java_Project.com.mile1.exception.NullMarksArrayException;
import Java_Project.com.mile1.exception.NullNameException;
import Java_Project.com.mile1.exception.NullStudentException;
import Java_Project.com.mile1.service.StudentReport;
import Java_Project.com.mile1.service.StudentService;

public class StudentMain {

    // TC - 1

//    static Student data[] = new Student[4];
//
//    static {
//
//        data[0] = new Student("Sekar" , new int[]{35,35,35});
//        data[1] = new Student(null , new int[]{11,22,33});
//        data[2] = null;
//        data[3] = new Student("Manoj",null);
//    }


    //TC - 2

    static Student data[] = new Student[8];

    static {

        for(int i=0;i< data.length;i++){
            data[i] = new Student();
        }

        data [0] = new Student ("A1", new int [ ] {72, 73, 74});
        data [1] = new Student ("B1", new int [ ] {75, 76, 77});
        data [2] = new Student ("C1", new int[ ] {99, 99, 99});
        data [3] = new Student ("C3", new int[ ] {100, 100, 99});
        data [4] = new Student ("B2", new int[ ] {13, 88, 13});
        data [5] = new Student ("C3", new int[ ] {14, 14, 99});
        data [6] = new Student ("A2", new int[ ] {77, 55, 12});
        data [7] = new Student ("A5", new int[ ] {13, 88, 13});
    }

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        StudentReport studentReport = new StudentReport();

        System.out.println("Grades Calculation : ");
        String result = null;

        for(int i=0;i<data.length;i++){

            try{
                result = studentReport.validate(data[i]);
            }catch (NullNameException e){
                result = e.toString();
            } catch (NullStudentException e) {
                result = e.toString();
            } catch (NullMarksArrayException e) {
                result = e.toString();
            }

            System.out.println("GRADE = "+result);

        }


        System.out.println("Number of Objects with Marks array as null = "+studentService.findNumberOfNullObjects(data));
        System.out.println("Number of Objects with Name array as null = "+studentService.findNumberOfNullNames(data));
        System.out.println("Number of Objects are entirely null = "+studentService.findNumberOfNullObjects(data));

    }




}

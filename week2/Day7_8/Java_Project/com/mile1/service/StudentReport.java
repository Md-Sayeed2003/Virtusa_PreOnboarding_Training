package Java_Project.com.mile1.service;

import Java_Project.com.mile1.bean.Student;
import Java_Project.com.mile1.exception.NullMarksArrayException;
import Java_Project.com.mile1.exception.NullNameException;
import Java_Project.com.mile1.exception.NullStudentException;

public class StudentReport {

    public String findGrade(Student studentObj){

        int[] marks = studentObj.getMarks();

        for(int mark : marks){
            if(mark < 35){
                return "F";
            }
        }

        int sum = 0;

        for(int mark : marks){
            sum += mark;
        }

        if(sum <= 150)
            return "D";
        else if(sum <=200)
            return "C";
        else if(sum <= 250)
            return "B";
        else
            return "A";

    }

    public String validate(Student studentObj) throws NullStudentException , NullNameException , NullMarksArrayException{


        if(studentObj == null){
            throw new NullStudentException();
        }

        if(studentObj.getName() == null){
            throw new NullNameException();
        }

        if(studentObj.getMarks() == null){
            throw new NullMarksArrayException();
        }

        return findGrade(studentObj);

    }
}

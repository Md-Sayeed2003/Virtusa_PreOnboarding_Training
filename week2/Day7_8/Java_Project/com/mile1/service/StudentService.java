package Java_Project.com.mile1.service;

import Java_Project.com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarks(Student data[]){

        int count = 0;

        for(Student d : data){
            if(d!=null && d.getMarks() == null){
                count++;
            }
        }

        return count;
    }


    public int findNumberOfNullNames(Student data[]){
        int count = 0;
        for(Student d : data){
            if(d!=null && d.getName() == null){
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student data[]){
        int count = 0;

        for(Student d : data){
            if(d == null) count++;
        }

        return count;
    }


}

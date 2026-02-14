package Day5.Task1;

import Day5.Student;

import java.util.*;
import java.util.stream.*;

public class TopStudent {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Aman", 85),
                new Student("Sayeed", 92),
                new Student("Rahul", 78),
                new Student("Chetan", 95),
                new Student("Amit", 88)
        );

        List<String> top3 = students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()))
                .limit(3)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Top 3 Students: " + top3);
    }
}


package Day5.Task4;

import java.util.*;
import java.util.stream.*;

public class EmployeeSalaryFilter {
    public static void main(String[] args) {

        Map<String, Integer> employees = new HashMap<>();
        employees.put("Aman", 45000);
        employees.put("Sayeed", 70000);
        employees.put("Rahul", 52000);
        employees.put("Zara", 48000);
        employees.put("Neha", 90000);

        employees.entrySet().stream()
                .filter(entry -> entry.getValue() > 50000)
                .map(Map.Entry::getKey)
                .sorted()
                .forEach(System.out::println);
    }
}

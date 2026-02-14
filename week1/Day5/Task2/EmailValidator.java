package Day5.Task2;

import java.util.*;

public class EmailValidator {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "a@gmail.com",
                "b@gmail.com",
                "a@gmail.com",
                "c@gmail.com",
                "b@gmail.com"
        );

        Set<String> uniqueEmails = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String email : emails) {
            if (!uniqueEmails.add(email)) {
                duplicates.add(email);
            }
        }

        System.out.println("Total Unique Emails: " + uniqueEmails.size());
        System.out.println("Duplicate Emails: " + duplicates);
    }
}


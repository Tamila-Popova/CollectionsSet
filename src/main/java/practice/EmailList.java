package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    TreeSet<String> emails = new TreeSet<>();

    public void add(String email) {
        String regex = "[A-z]+@[A-z]+[.][a-z]{2,4}";
        if (email.matches(regex)) {
            emails.add(email.toLowerCase());
            System.out.println("Добавлен новый адрес электронной почты: " + email);
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        System.out.println(emails);
        return new ArrayList<>(emails);
    }
}

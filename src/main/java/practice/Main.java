package practice;

import java.util.Scanner;

public class Main {
    private static EmailList emailList = new EmailList();
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("0")) {
                break;
            }
            String[] inputArray = input.split("\\s", 2);
            for (int i = 0; i < inputArray.length; i++) {
                switch (inputArray[0]) {
                    case "add" -> {
                        emailList.add(inputArray[1]);
                    }
                    case "list" -> {
                        emailList.getSortedEmails();
                    }
                }
            }
        }
    }
}

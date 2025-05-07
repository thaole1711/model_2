package case_study.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegularExpression {
    public static String checkId(Scanner scanner, String message) {
        boolean check;
        String id;
        do {
            System.out.println(message);
            id = scanner.nextLine();
            String regexId = "^N+V+-+\\d{4}$";
            check = id.matches(regexId);
        } while (!check);
        return id;
    }

    public static String checkName(Scanner scanner, String message) {
        boolean checkname;
        String name;
        do {
            System.out.println(message);
            name = scanner.nextLine();
            String regexName = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
            checkname = name.matches(regexName);
        } while (!checkname);
        return name;
    }

    public static String checkIdNumber(Scanner scanner, String message) {
        boolean checkIdNumber;
        String IdNumber;
        do {
            System.out.println(message);
            IdNumber = scanner.nextLine();
            String regexCMND = "^[0-9]{9,12}$";
            checkIdNumber = IdNumber.matches(regexCMND);
        } while (!checkIdNumber);
        return IdNumber;
    }

    public static String checkPhone(Scanner scanner, String message) {
        boolean checkPhone;
        String phone;
        do {
            System.out.println(message);
            phone = scanner.nextLine();
            String regexPhone = "^0+[0-9]{9}$";
            checkPhone = phone.matches(regexPhone);
        } while (!checkPhone);
        return phone;
    }

    public static double checksalary(Scanner scanner, String message) {
        boolean checksalary = true;

        double salary =-1;
        do {
            System.out.println(message);
            try {
                salary = Double.parseDouble(scanner.nextLine());
                if (salary > 0) {
                    checksalary = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập số");
            }

        } while (!checksalary);
        return salary;
    }

    public static boolean is18OrOlder(String string) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(string, formatter);
            LocalDate today = LocalDate.now();
            Period age = Period.between(date, today);
            if (age.getYears() > 18) {
                return true;
            }
            return age.getYears() == 18 && (age.getMonths() > 0 || (age.getMonths() == 0 && age.getDays() >= 0));
        } catch (DateTimeParseException ex) {
            return false;
        }

    }

    public static String checkdate(Scanner scanner, String string) {
        boolean is18Older;
        String date;
        do {
            System.out.println(string);
            date = scanner.nextLine();
            is18Older = is18OrOlder(date);

        } while (!is18Older);
        return date;

    }
    public static String checkIdCustomer(Scanner scanner, String message) {
        boolean check;
        String id;
        do {
            System.out.println(message);
            id = scanner.nextLine();
            String regexId = "^K+H+-+[0-9]{4}$";
            check = id.matches(regexId);
        } while (!check);
        return id;

    }
}
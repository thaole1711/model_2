package case_study.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

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

    public static String checkCMND(Scanner scanner, String message) {
        boolean checkCMND;
        String soCMND;
        do {
            System.out.println(message);
            soCMND = scanner.nextLine();
            String regexCMND = "^[0-9]{9,12}$";
            checkCMND = soCMND.matches(regexCMND);
        } while (!checkCMND);
        return soCMND;
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

    public static double checkLuong(Scanner scanner, String message) {
        boolean checkLuong = true;
        double luong =-1;
        do {
            System.out.println(message);
            try {
                luong = Double.parseDouble(scanner.nextLine());
                if (luong > 0) {
                    checkLuong = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập số");
            }

        } while (!checkLuong);
        return luong;
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
        boolean check;
        boolean is18Older;
        String date;
        do {
            System.out.println(string);
            date = scanner.nextLine();
            String regexDate = "^(0[1-9]|[12][0-9]|3[01])/((0[1-9]|1[0-2])/(19|20)\\d\\d)$";
            check = date.matches(regexDate);
            is18Older = is18OrOlder(date);

        } while (!check || !is18Older);
        return date;

    }

}
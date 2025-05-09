package hoa_don_tien_dien.common;

import java.util.Scanner;

public class RegularExpressionCustomer {
    public static String checkId(Scanner scanner, String message) {
        boolean check;
        String id;
        do {
            System.out.println(message);
            id = scanner.nextLine();
            String regexId = "^KHVN+-+0000\\d{1}$";
            check = id.matches(regexId);
        } while (!check);
        return id;
    }
    public static String checkIdForeign(Scanner scanner, String message) {
        boolean check;
        String id;
        do {
            System.out.println(message);
            id = scanner.nextLine();
            String regexId = "^KHNN+-+0000\\d{1}$";
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
}

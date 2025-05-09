package case_study.common;

import java.util.Scanner;

public class RegularExpressionFacility {
    public static String checkId(Scanner scanner, String message, String type) {
        boolean check;
        String regex;
        String id;
        do {
            System.out.println(message);
            id = scanner.nextLine();
            if (type.equals("villa")) {
                regex = "^SVVL-\\d{4}$";
            } else if (type.equals("house")) {
                regex = "SVHO-\\d{4}$";
            } else {
                regex = "SVRO-\\d{4}$";
            }
            check = id.matches(regex);
        } while (!check);
        return id;
    }

    public static String checkName(Scanner scanner, String message) {
        boolean check;
        String name;
        String regex;
        do {
            System.out.println(message);
            name = scanner.nextLine();
            regex = "^([A-Z][a-z]*)(\\s[a-z]*)*$";
            check = name.matches(regex);
        } while (!check);
        return name;
    }

    public static double checkArea(Scanner scanner, String message) {
        boolean check = true;
        double area = 0.0;
        do {
            System.out.println(message);
            try {
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 30) {
                    System.out.println("nhập lại diện tích lớn hơn 30");
                    check = false;
                }else {
                    check=true;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhâp số");
            }
        } while (!check);
        return area;
    }

    public static double checkCost(Scanner scanner, String message) {
        boolean check = true;
        double cost = 0;
        do {
            System.out.println(message);
            try {
                cost = Integer.parseInt(scanner.nextLine());
                if (cost <= 0) {
                    System.out.println("nhập lại chi phí lớn hơn 0");
                    check = false;
                }else {
                    check=true;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập số");
            }

        } while (!check);
        return cost;
    }

    public static int checkPeople(Scanner scanner, String message) {
        boolean check = true;
        int people = 0;
        do {
            System.out.println(message);
            try {
                people = Integer.parseInt(scanner.nextLine());
                if (people <= 0 || people >= 20) {
                    System.out.println("nhập lại số lương lớn hơn 0 và nhỏ hơnn 20");
                    check = false;
                }else {
                    check=true;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập số");
            }
        } while (!check);
        return people;
    }

    public static int checkfloor(Scanner scanner, String message) {
        boolean check = true;
        int floor = 0;
        do {
            System.out.println(message);
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor < 0) {
                    System.out.println("nhập lại số tầng lớn hơn 0");
                    check = false;
                }else {
                    check=true;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập số");
            }

        } while (!check);
        return floor;

    }
    public static String checkRentalAndStandard(Scanner scanner, String message) {
        boolean check;
        String rentalAndStandard;
        String regex;
        do {
            System.out.println(message);
            rentalAndStandard = scanner.nextLine();
            regex = "^([A-Z][a-z]*)(\\s[a-z]*)*$";
            check = rentalAndStandard.matches(regex);
        } while (!check);
        return rentalAndStandard;
    }

}
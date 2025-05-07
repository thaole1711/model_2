package case_study.view;

import case_study.common.RegularExpression;
import case_study.model.Employee;

import java.util.List;
import java.util.Scanner;


public class EmployeeView {
    public static Scanner scanner = new Scanner(System.in);

    public static Employee add() {
        String name = RegularExpression.checkName(scanner, "nhập tên nhân viên: ");
        String id = RegularExpression.checkId(scanner, "nhập mã nhân viên:");
        System.out.println("nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        String date = RegularExpression.checkdate(scanner, "nhập ngày tháng năm sinh của nhân viên:");
        System.out.println("nhập email nhân viên");
        String email = scanner.nextLine();
        String idNumber = RegularExpression.checkIdNumber(scanner, "nhập số CMND nhân viên:");
        String phoneNumber = RegularExpression.checkPhone(scanner, "nhập số điện thoại nhân viên:");
        double salary = RegularExpression.checksalary(scanner, "nhập lương nhân viên:");
        System.out.println("nhập vị trí nhân viên:lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc:");
        String position = scanner.nextLine();
        System.out.println("nhập trình độ nhân viên:Trung cấp, Cao đẳng, Đại học và Sau đại học:");
        String level = scanner.nextLine();
        Employee employee = new Employee(name, date, gender, idNumber, phoneNumber, email, id, level, position, salary);
        return employee;
    }
    
    

    public static void display(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
//    public Employee(String fullName, String date, String gender, String IDNumber, String phoneNumber, String email, String idEmployee, String level, String position, double salary) {

    public static Employee update(String id) {
        String fullName = RegularExpression.checkName(scanner, "nhập tên nhân viên: ");
        System.out.println("nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        String date = RegularExpression.checkdate(scanner, "nhập ngày tháng năm sinh của nhân viên:");
        System.out.println("nhập email nhân viên");
        String email = scanner.nextLine();
        String idNumber = RegularExpression.checkIdNumber(scanner, "nhập số CMND nhân viên:");
        String phoneNumber = RegularExpression.checkPhone(scanner, "nhập số điện thoại nhân viên:");
        double salary = RegularExpression.checksalary(scanner, "nhập lương nhân viên:");
        System.out.println("nhập vị trí nhân viên:lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc:");
        String position = scanner.nextLine();
        System.out.println("nhập trình độ nhân viên:Trung cấp, Cao đẳng, Đại học và Sau đại học:");
        String level = scanner.nextLine();
        Employee employee = new Employee(email, fullName, gender, date, idNumber, phoneNumber, id, level, position, salary);
        return employee;
    }
    public static String findId() {
        System.out.println("nhập id cần tìm:");
        String id = scanner.nextLine();
        return id;
    }


}

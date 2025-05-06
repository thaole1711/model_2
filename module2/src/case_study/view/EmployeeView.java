package case_study.view;

import case_study.common.ExceptionManagement;
import case_study.common.RegularExpression;
import case_study.model.Employee;

import java.util.List;
import java.util.Scanner;


public class EmployeeView {
    public static Scanner scanner = new Scanner(System.in);

    public static Employee add() {
        String tenNhanVien = RegularExpression.checkName(scanner, "nhập tên nhân viên: ");
        String maNhanVien = RegularExpression.checkId(scanner, "nhập mã nhân viên:");
        System.out.println("nhập giới tính nhân viên");
        String gioiTinhNhanVien = scanner.nextLine();
        String ngaySinhNhanVien = RegularExpression.checkdate(scanner, "nhập ngày tháng năm sinh của nhân viên:");
        System.out.println("nhập email nhân viên");
        String emailNhanVien = scanner.nextLine();
        String soCMND = RegularExpression.checkCMND(scanner, "nhập số CMND nhân viên:");
        String soDienThoai = RegularExpression.checkPhone(scanner, "nhập số điện thoại nhân viên:");
        double luongNhanVien = RegularExpression.checkLuong(scanner, "nhập lương nhân viên:");
        System.out.println("nhập vị trí nhân viên:lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc:");
        String viTriNhanVien = scanner.nextLine();
        System.out.println("nhập trình độ nhân viên:Trung cấp, Cao đẳng, Đại học và Sau đại học:");
        String trinhDoNhanVien = scanner.nextLine();


//String email, String hoTen, String gioiTinh, String ngaySinh, String soCMND, String soDienThoai, String maNhanVien, String trinhDo, String viTri, double luong
//    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, double luong) {
        Employee employee = new Employee(tenNhanVien, ngaySinhNhanVien, gioiTinhNhanVien, soCMND, soDienThoai, emailNhanVien, maNhanVien, trinhDoNhanVien, viTriNhanVien, luongNhanVien);
        return employee;
    }

    public static void display(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Employee update(String id) {
        String tenNhanVien = RegularExpression.checkName(scanner, "nhập tên nhân viên: ");
        System.out.println("nhập giới tính nhân viên");
        String gioiTinhNhanVien = scanner.nextLine();
        String ngaySinhNhanVien = RegularExpression.checkdate(scanner, "nhập ngày tháng năm sinh của nhân viên:");
        System.out.println("nhập email nhân viên");
        String emailNhanVien = scanner.nextLine();
        String soCMND = RegularExpression.checkCMND(scanner, "nhập số CMND nhân viên:");
        String soDienThoai = RegularExpression.checkPhone(scanner, "nhập số điện thoại nhân viên:");
        double luongNhanVien = RegularExpression.checkLuong(scanner, "nhập lương nhân viên:");
        System.out.println("nhập vị trí nhân viên:lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc:");
        String viTriNhanVien = scanner.nextLine();
        System.out.println("nhập trình độ nhân viên:Trung cấp, Cao đẳng, Đại học và Sau đại học:");
        String trinhDoNhanVien = scanner.nextLine();
        Employee employee = new Employee(emailNhanVien, tenNhanVien, gioiTinhNhanVien, ngaySinhNhanVien, soCMND, soDienThoai, id, trinhDoNhanVien, viTriNhanVien, luongNhanVien);
        return employee;
    }

    public static String findId() {
        System.out.println("nhập id cần tìm:");
        String id = scanner.nextLine();
        return id;
    }


}

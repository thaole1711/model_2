package case_study.view;

import case_study.common.RegularExpression;
import case_study.model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static void findAll(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
//    Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String email, String maKhachHang, String loaiKhach, String diaDiem) {

    public static Customer add() {
        String name = RegularExpression.checkName(scanner, "nhập họ tên khách hàng:");
        String older = RegularExpression.checkdate(scanner, "nhập ngày sinh khách hàng:");
        System.out.println("nhập giới tính khách hàng:");
        String gender = scanner.nextLine();
        String IDNumber = RegularExpression.checkIdNumber(scanner, "nhập số IDNumber khách hàng:");
        String phoneNumber = RegularExpression.checkPhone(scanner, "nhập số điên thoại khách hàng:");
        System.out.println("nhập email khách hàng:");
        String email = scanner.nextLine();
        String id = RegularExpression.checkIdCustomer(scanner, "nhập mã khách hàng:");
        System.out.println("nhập loại khách hàng:Diamond, Platinum, Gold, Silver, Member");
        String customerType = scanner.nextLine();
        System.out.println("nhập địa chỉ khách hàng:");
        String address=scanner.nextLine();
        return new Customer(name,older,gender,IDNumber,phoneNumber,email,id,customerType,address);

    }
    public static String findId(){
        System.out.println("nhập id:");
        String id= scanner.nextLine();
        return id;
    }
    public static Customer update( String id){
        String nameUpdate = RegularExpression.checkName(scanner, "nhập họ tên khách hàng:");
        String older = RegularExpression.checkdate(scanner, "nhập ngày sinh khách hàng:");
        System.out.println("nhập giới tính khách hàng:");
        String gender = scanner.nextLine();
        String IDNumber = RegularExpression.checkIdNumber(scanner, "nhập số CMND khách hàng:");
        String phoneNumber = RegularExpression.checkPhone(scanner, "nhập số điên thoại khách hàng:");
        System.out.println("nhập email khách hàng:");
        String email = scanner.nextLine();
        System.out.println("nhập loại khách hàng:Diamond, Platinum, Gold, Silver, Member");
        String customerType = scanner.nextLine();
        System.out.println("nhập địa chỉ khách hàng:");
        String address=scanner.nextLine();
        return new Customer(nameUpdate,older,gender,IDNumber,phoneNumber,email,id,customerType,address);

    }
    public static String delete(){
        System.out.println("nhập id cần xóa:");
        String idDelete= scanner.nextLine();
        return idDelete;
    }


}

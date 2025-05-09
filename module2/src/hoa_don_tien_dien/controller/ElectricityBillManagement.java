package hoa_don_tien_dien.controller;

import hoa_don_tien_dien.common.ExceptionElectric;
import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.service.CustomerService;
import hoa_don_tien_dien.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class ElectricityBillManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerService customerService = new CustomerService();

    public static void displayElectricityBill() {
        boolean flag = true;
        do {
            int number = 0;

            System.out.println(" quản lý hóa đơn tiền điện ");
            System.out.println(
                    "\n 1.thêm mới khách hàng" +
                            "\n 2. hiện thị thông tin khách hàng" +
                            "\n 3. tìm kiếm khách hàng" +
                            "\n 4. thêm mới hóa đơn" +
                            "\n 5. chỉnh sửa hóa đơn" +
                            "\n 6.hiện thị thông tin chi tiết hóa đơn" +
                            "\n 7. thoát");
            number = ExceptionElectric.exception(scanner, "chức năng bạn chon là:");
            switch (number) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                   List<Customer> customerList= customerService.findAll();
                    CustomerView.findAll(customerList);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("thoát chương trình");
                    flag = false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        } while (flag);
    }

    public static void addCustomer() {
        boolean flag = true;
        do {
            int number;
            System.out.println("chọn khach hàng bạn muốn thêm mới");
            System.out.println(
                    "\n 1.thêm khách hàng Việt Nam" +
                            "\n 2. thêm khách hàng nước ngoài" +
                            "\n 3. thoát");
            number = ExceptionElectric.exception(scanner, "chức năng bạn chọn là:");
            switch (number) {
                case 1:
                    Customer customer = CustomerView.addVietNam();
                    customerService.add(customer);
                    break;
                case 2:
                    Customer customer1 = CustomerView.addForeign();
                    customerService.add(customer1);
                    break;

                case 3:
                    System.out.println("thoat chuong trinh");
                    flag = false;
                    break;
                default:
                    System.out.println("nhap lai so tu 1 den 4");
            }

        } while (flag);
    }

}

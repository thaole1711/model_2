package case_study.controller;

import case_study.common.ExceptionManagement;
import case_study.model.Customer;
import case_study.service.CustomerService;
import case_study.view.CustomerView;

import java.util.Scanner;

public class CustomerController {
    public static void customerManagement() {
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            int number = 0;
            System.out.println("Customer Management");
            System.out.println(
                    "\n 1. Display list customers" +
                            "\n 2. Add new customer" +
                            "\n 3. Edit customer" +
                            "\n 4. Delete customer" +
                            "\n 5. Return main menu"
            );
            number = ExceptionManagement.exception(scanner, "\n chức năng bạn chọn là:");
            switch (number) {
                case 1:
                    CustomerView.findAll(customerService.findAll());
                    break;
                case 2:
                    customerService.add(CustomerView.add());
                    break;
                case 3:
                    String id = CustomerView.findId();
                    boolean found = customerService.findId(id);
                    if (found) {
                        Customer customer = CustomerView.update(id);
                        customerService.update(customer);
                    } else {
                        System.out.println("không tìm thấy mã khách hàng");
                    }
                    break;
                case 4:
                    String idDelete = CustomerView.delete();
                    if (customerService.findId(idDelete)) {
                        customerService.delete(idDelete);
                    }else {
                        System.out.println(" không tim thấy mã khách hàng");
                    }
                    break;
                case 5:
                    System.out.println("thoát chương trình");
                    flag = false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        } while (flag);
    }
}

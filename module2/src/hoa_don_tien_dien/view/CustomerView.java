package hoa_don_tien_dien.view;

import hoa_don_tien_dien.common.RegularExpressionCustomer;
import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.model.ForeignCustomer;
import hoa_don_tien_dien.model.VietNamCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static Customer addVietNam() {
        String id = RegularExpressionCustomer.checkId(scanner, "nhập mã khách hàng:");
        String name = RegularExpressionCustomer.checkName(scanner, "nhập tên khách hàng");
        System.out.println("nhập loại khách hàng(sinh hoạt, kinh doanh, sản suất):");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("nhập định mức tiêu thụ:");
        String electricityConsumption=scanner.nextLine();
        Customer customer =new VietNamCustomer(id,name,typeOfCustomer,electricityConsumption);
        return customer;
    }

    public static Customer addForeign() {
        String id = RegularExpressionCustomer.checkIdForeign(scanner, "nhập mã khách hàng:");
        String name = RegularExpressionCustomer.checkName(scanner, "nhập tên khách hàng");
        System.out.println("quốc tịch la:");
        String foreign=scanner.nextLine();
        Customer customer =new ForeignCustomer(id,name,foreign);
        return customer;
    }
    public static void findAll(List<Customer> customers){
        for (Customer customer: customers){
            System.out.println(customer);
        }
    }
    public static String seach(){
        System.out.println("nhập tên bạn cần tìm:");
        String name= scanner.nextLine();
        return name;
    }
}

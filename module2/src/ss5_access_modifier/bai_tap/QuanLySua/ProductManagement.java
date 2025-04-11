package ss5_access_modifier.bai_tap.QuanLySua;

import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);
    public static Product[] product = new Product[100];

    static {
        product[0] = new Product(1, "vinamilk", 5000);
        product[1] = new Product(2, "TH", 6000);
        product[2] = new Product(3, "milo", 7000);
    }

    public void Display() {
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                System.out.println(product[i]);
            } else {
                break;
            }
        }
    }

    public void Add() {
        System.out.println("nhập mã loại sữa:");
        int idNew = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên loại sữa:");
        String nameNew = scanner.nextLine();
        System.out.println("nhập giá loại sữa");
        double priceNew = scanner.nextDouble();
        for (int i = 0; i < product.length; i++) {
            if (product[i] == null) {
                product[i] = new Product(idNew, nameNew, priceNew);
                break;
            }
        }
    }

    public void Update() {
        System.out.println("nhập id bạn muốn thay đổi sản phẩm");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < product.length; i++) {
            if (product[i].getId() == updateId) {
                System.out.println("nhap tên bạn muốn thay đổi");
                String updateName = scanner.nextLine();
                System.out.println("nhập giá bạn muốn thay đổi");
                double updatePrice = scanner.nextDouble();
                product[i] = new Product(updateId, updateName, updatePrice);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("không tìm thấy id bạn nhập");
        }
    }

    public void Delete() {
        System.out.println("nhập id sản phẩm bạn muốn xoa");
        int deleteId = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < product.length; i++) {
            if (product[i]!=null&&product[i].getId() == deleteId) {
                found = true;
                for (int j = i; j < product.length - 1; j++) {
                    product[j] = product[j + 1];
                }
                product[product.length-1]=null;
                System.out.println("Đã xóa sản phẩm");
                break;
            }
        }
        if(!found){
            System.out.println("không tìm thấy id bạn nhập vào");
        }
    }
    public void Search(){
        System.out.println("nhập tên sản phẩm bạn muốn tìm kiếm");
        String SearchName=scanner.nextLine();
        boolean found=false;
        for (int i = 0; i < product.length; i++) {
            if(product[i]!=null&&product[i].getName().contains(SearchName)){
                found=true;
                System.out.println("sản phẩm bạn tìm kiếm là"+product[i]);
                break;
            }

        }
        if(!found){
            System.out.println("không tìm thấy tên sản phẩm bạn tìm kiêm");
        }
    }


}




package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.view;

import java.util.Scanner;

public class XoaPhuonngTienView {
    public  static Scanner scanner= new Scanner(System.in);
    public String xoa(){
        System.out.println("nhap biển kiểm xóa bạn muốn xóa");
        String bienXoa= scanner.nextLine();
        return bienXoa;
    }
}

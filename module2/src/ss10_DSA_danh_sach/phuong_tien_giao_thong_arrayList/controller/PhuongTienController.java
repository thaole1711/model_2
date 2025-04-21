package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.controller;

import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.PhuongTien;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.sevice.PhuongTienSevice;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.view.PhuongTienView;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.view.XoaPhuonngTienView;

import java.util.Scanner;

public class PhuongTienController {
    public static Scanner scanner = new Scanner(System.in);
  PhuongTienView phuongTienView =new PhuongTienView();
  PhuongTienSevice phuongTienSevice =new PhuongTienSevice();
   XoaPhuonngTienView xoaPhuonngTienView= new XoaPhuonngTienView();
    public void hienThiMenu() {
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ PHƯƠNG TIỆN GIAO THÔNG");
        byte number;
        do {
            System.out.println("chọn chức năng:" +
                    "\n 1.thêm mới phương tiện" +
                    "\n 2. hiển thị phương tiện" +
                    "\n 3. xóa phuoownng tiện" +
                    "\n 4. thoát chương trình" +
                    "\n chức năng bạn chọn la:");
            number = scanner.nextByte();

            switch (number) {
                case 1:
                    themPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    String bienSo =xoaPhuonngTienView.xoa();
                   phuongTienSevice.xoa(bienSo);
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    System.exit(0);
            }

        } while (number != 4);
    }

    public void themPhuongTien() {
        byte so = 0;
        do {
            System.out.println("bạn muốn chọn xe nào:" +
                    "\n 1. xe tải" +
                    "\n 2. xe oto" +
                    "\n 3. xe máy" +
                    "\n 4. thoát" +
                    "\n sô bạn chọn là:");
            so = scanner.nextByte();
            switch (so) {
                case 1, 2 ,3:
                 PhuongTien phuongTien =  phuongTienView.themPhuongTien(so);
                 phuongTienSevice.them(phuongTien);
                    System.out.println(phuongTien);
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    System.exit(0);
            }
        } while (so != 4);
    }
    public void hienThiPhuongTien(){
        byte so = 0;
        do {
            System.out.println("bạn muốn chọn xe nào:" +
                    "\n 1. xe oto" +
                    "\n 2. xe tải" +
                    "\n 3. xe máy" +
                    "\n 4. thoát" +
                    "\n sô bạn chọn là:");
            so = scanner.nextByte();
            switch (so) {
                case 1,2,3:
                    phuongTienSevice.hienThi(so);
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    System.exit(0);
            }
        } while (so != 4);
    }

}

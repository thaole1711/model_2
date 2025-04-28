package ghi_file_quan_li_san_pham.controller;

import java.util.Scanner;

public class PhuongTienController {
   private static Scanner scanner =new Scanner(System.in);
    public static void HienThiChucNang(){
        boolean flag=true;
      do {
          System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
          System.out.println("chọn chức năng:" +
                  "\n 1. thêm mới phương tiện" +
                  "\n 2. hiện thị phương tiện" +
                  "\n 3. xóa phương tiện" +
                  "\n 4. sua phương tiên" +
                  "\n 5. tìm kiếm phương tiện" +
                  "\n 6. thoát chương trinh");
          int number = scanner.nextInt();
          switch (number) {
              case 1:
                  TungLoaiPhuongTien.ChonPhuongTien();
                  break;
              case 2:
                  break;
              case 3:
                  break;
              case 4:
                  break;
              case 5:
                  break;
              case 6:
                  System.out.println("thoat chuong trinh");
                  System.exit(0);
                  break;
              default:
                  flag=false;
                  System.out.println("nhap lai tu 1 den 6");
          }
      }while(flag);
    }
}

package ghi_file_quan_li_san_pham.controller;

import java.util.Scanner;

public class TungLoaiPhuongTien {
    private static Scanner scanner =new Scanner(System.in);
    public static void ChonPhuongTien(){
        boolean flag=true;
        do{
            System.out.println("ban se chon phuong tien:");
            System.out.println("1. oto" +
                    "\n2. xe may" +
                    "\n3. xe tai" +
                    "\n 4. thoat chuong trinh" +
                    "\n ban chon so:");
            int number=scanner.nextInt();
            switch (number){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    flag =false;
                    break;
                default:
                    System.out.println("nhap lai so tu 1 den 4");

            }
        }while (flag);
    }
}

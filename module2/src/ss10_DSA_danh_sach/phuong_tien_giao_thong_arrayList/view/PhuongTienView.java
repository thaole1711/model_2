package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.view;


import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.May;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.Oto;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.PhuongTien;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.Tai;

import java.util.Scanner;

public class PhuongTienView {
    public Scanner scanner = new Scanner(System.in);

    public PhuongTien themPhuongTien(byte choose) {
        PhuongTien phuongTien;
        System.out.println("nhập biển kiểm soát");
        String bien = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String hang = scanner.nextLine();
        System.out.println("nhập năm");
        int nam = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sở hửu");
        String ten = scanner.nextLine();
        if (choose == 1) {
            System.out.println("nhập trong tải");
            double trongTai = scanner.nextDouble();
            phuongTien = new Tai(bien, hang, nam, ten, trongTai);
        } else if (choose == 2) {
            System.out.println("nhập kiểu xe");
            String kieuXe = scanner.nextLine();
            System.out.println("nhập số chỗ ngồi");
            int choNgoi = scanner.nextByte();
            phuongTien = new Oto(bien, hang, nam, ten, kieuXe, choNgoi);
        } else {
            System.out.println("nhập công suất");
            double congSuat = scanner.nextInt();
            phuongTien = new May(bien, hang, nam, ten, congSuat);
        }
        return phuongTien;

    }
}

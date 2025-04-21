package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.sevice;

import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.PhuongTien;

import java.util.List;

public interface IPhuongTienSevice {
    void hienThi(byte choose);
    PhuongTien them(PhuongTien phuongTien);
    void xoa(String bienSoxe);
}

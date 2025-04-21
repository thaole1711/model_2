package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.repository;

import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.May;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.Oto;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.PhuongTien;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.Tai;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository implements IPhuongTienRepository {


    private static List<PhuongTien> phuongTiens = new ArrayList<>();

    static {
        phuongTiens.add(new Oto("43A-212.56", "Toyota", 2019, " Nguyễn Văn A", "du lịch", 5));
        phuongTiens.add(new Oto("43B-453.88", "yamaha", 2020, " Nguyễn Văn B", "khach", 9));
        phuongTiens.add(new Oto("43B-453.89", "Toyota", 2021, " Nguyễn Văn C", "du lịch", 12));
        phuongTiens.add(new Tai("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        phuongTiens.add(new Tai("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
        phuongTiens.add(new Tai("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        phuongTiens.add(new May("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        phuongTiens.add(new May("43-H1-345.89", "toyota", 2011, "Nguyễn Văn B", 112));
        phuongTiens.add(new May("43-AK-765.23", "Yamaha", 2015, "Nguyễn Văn C", 122));
    }

    @Override
    public void hienThi(byte choose) {
        for (PhuongTien phuongTien : phuongTiens) {
            if (choose == 1 && phuongTien instanceof Oto oto) {
                System.out.println(oto);
            } else if (choose == 2 && phuongTien instanceof Tai tai) {
                System.out.println(tai);
            } else if(choose == 3 && phuongTien instanceof May may){
                System.out.println(may);
            }
        }
    }
    @Override
    public PhuongTien them(PhuongTien phuongTien) {
         phuongTiens.add(phuongTien);
         return phuongTien;

    }

    @Override
    public void xoa(String bienSoxe) {
        for ( PhuongTien phuongTien : phuongTiens){
            if(phuongTien.getBienKiemSoat().equals(bienSoxe)){
               phuongTiens.remove(phuongTien);
                System.out.println("xoa bien so xe thanh cong");
                return;
            }
        }
        System.out.println("xoa khong thanh cong");

    }


//    @Override
//    public boolean xoa(String bienSoxe) {
//        for (PhuongTien phuongTien : phuongTiens) {
//            if (phuongTien.getBienKiemSoat().equals(bienSoxe)) {
//                return phuongTiens.remove(phuongTien);
//            }
//        }
//        return false;
//    }
}


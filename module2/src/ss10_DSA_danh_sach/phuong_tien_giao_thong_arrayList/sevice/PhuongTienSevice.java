package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.sevice;

import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity.PhuongTien;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.repository.IPhuongTienRepository;
import ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.repository.PhuongTienRepository;

import java.util.List;

public class PhuongTienSevice implements IPhuongTienSevice {
    IPhuongTienRepository phuongTienRepository = new PhuongTienRepository();

    @Override
    public void hienThi(byte choose){
        phuongTienRepository.hienThi(choose);
    }

    @Override
    public PhuongTien them(PhuongTien phuongTien) {
        return phuongTienRepository.them(phuongTien);
    }

    @Override
    public void xoa(String bienSoxe) {
         phuongTienRepository.xoa(bienSoxe);
    }


    }


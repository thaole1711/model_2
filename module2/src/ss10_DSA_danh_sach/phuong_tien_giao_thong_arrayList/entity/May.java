package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity;

public class May extends PhuongTien {
    private double congSuat;

    public May(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",congSuat=" + congSuat ;
    }
}

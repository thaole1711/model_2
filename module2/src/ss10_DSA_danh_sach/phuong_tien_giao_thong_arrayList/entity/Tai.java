package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity;

public class Tai extends PhuongTien{
    private double trongTai;

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",trongTai=" + trongTai;
    }

    public Tai(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;

    }
}

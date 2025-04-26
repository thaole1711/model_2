package ghi_file_quan_li_san_pham.entity;

public class XeMay extends PhuongTien{
    private double congSuat;

    public XeMay(String bienKiemSoat, String tenHang, String chuSoHuu, int namSanXuat, double congSuat) {
        super(bienKiemSoat, tenHang, chuSoHuu, namSanXuat);
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
                ",congSuat=" + congSuat;
    }
}

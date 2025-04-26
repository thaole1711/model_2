package ghi_file_quan_li_san_pham.entity;

public class XeTai extends PhuongTien{
    private double trongTai;

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHang, String chuSoHuu, int namSanXuat, double trongTai) {
        super(bienKiemSoat, tenHang, chuSoHuu, namSanXuat);
        this.trongTai = trongTai;

    }

    @Override
    public String toString() {
        return super.toString()+
                "trongTai=" + trongTai;
    }
}

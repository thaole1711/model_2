package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity;

public abstract class PhuongTien {
    protected String bienKiemSoat,tenHang;
    protected int namSanXuat;
    protected String chuSoHuu;

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public PhuongTien(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;

    }

    @Override
    public String toString() {
        return
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' ;
    }
}

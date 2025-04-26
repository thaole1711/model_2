package ghi_file_quan_li_san_pham.entity;

public abstract class PhuongTien {
    protected  String bienKiemSoat, tenHang,chuSoHuu;
    protected int namSanXuat;

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

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public PhuongTien(String bienKiemSoat, String tenHang, String chuSoHuu, int namSanXuat) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHang = tenHang;
        this.chuSoHuu = chuSoHuu;
        this.namSanXuat = namSanXuat;

    }

    @Override
    public String toString() {
        return
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", namSanXuat=" + namSanXuat ;
    }
}

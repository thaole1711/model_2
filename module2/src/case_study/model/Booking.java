package case_study.model;

public class Booking {
    private String maBooking;
    private int ngayBooking;
    private int ngayBatDauThue;
    private int ngayKetThucThue;
    private String maKhachHang;
    private String maDichVu;

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBooking() {
        return ngayBooking;
    }

    public void setNgayBooking(int ngayBooking) {
        this.ngayBooking = ngayBooking;
    }

    public int getNgayBatDauThue() {
        return ngayBatDauThue;
    }

    public void setNgayBatDauThue(int ngayBatDauThue) {
        this.ngayBatDauThue = ngayBatDauThue;
    }

    public int getNgayKetThucThue() {
        return ngayKetThucThue;
    }

    public void setNgayKetThucThue(int ngayKetThucThue) {
        this.ngayKetThucThue = ngayKetThucThue;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public Booking(String maBooking, int ngayBooking, int ngayBatDauThue, int ngayKetThucThue, String maKhachHang, String maDichVu) {
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
        this.ngayBatDauThue = ngayBatDauThue;
        this.ngayKetThucThue = ngayKetThucThue;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return
                "maBooking='" + maBooking + '\'' +
                ", ngayBooking=" + ngayBooking +
                ", ngayBatDauThue=" + ngayBatDauThue +
                ", ngayKetThucThue=" + ngayKetThucThue +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maDichVu='" + maDichVu + '\'' ;
    }

}

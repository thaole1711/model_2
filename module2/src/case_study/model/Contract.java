package case_study.model;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private double tienCoc;
    private double tongSoTienThanhToan;

    public Contract(String soHopDong, String maBooking, double tienCoc, double tongSoTienThanhToan) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.tienCoc = tienCoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(double tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    @Override
    public String toString() {
        return
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", tienCoc=" + tienCoc +
                ", tongSoTienThanhToan=" + tongSoTienThanhToan ;
    }
}

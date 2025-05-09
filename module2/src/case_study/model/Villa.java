package case_study.model;

public class Villa extends Facility{
    private String tieuChuanPhong;
    private double dientichHoBoi;
    private int soTang;

    public Villa(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, double dientichHoBoi, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dientichHoBoi = dientichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDientichHoBoi() {
        return dientichHoBoi;
    }

    public void setDientichHoBoi(double dientichHoBoi) {
        this.dientichHoBoi = dientichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dientichHoBoi=" + dientichHoBoi +
                ", soTang=" + soTang ;
    }


    public String getInfoVilla(int count) {
    return super.getInfoFacility()+","+this.tieuChuanPhong+","+this.dientichHoBoi+","+this.soTang+count;
    }
}

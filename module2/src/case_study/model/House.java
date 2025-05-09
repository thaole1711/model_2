package case_study.model;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang;
    }


    public String getInfoHouse(int count) {
        return super.getInfoFacility()+","+this.tieuChuanPhong+","+this.soTang+","+count;
    }
}

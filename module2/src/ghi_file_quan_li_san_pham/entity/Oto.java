package ghi_file_quan_li_san_pham.entity;

public class Oto extends PhuongTien{
    private String kieuXe;
    private int soChoNgoi;



    public Oto(String bienKiemSoat, String tenHang, String chuSoHuu, int namSanXuat, String kieuXe, int soChoNgoi) {
        super(bienKiemSoat, tenHang, chuSoHuu, namSanXuat);
        this.kieuXe = kieuXe;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public String toString() {
        return super.toString()+
                ",kieuXe='" + kieuXe + '\'' +
                ", soChoNgoi=" + soChoNgoi ;
    }
    public String getInFoToFileOto(){
        return super.bienKiemSoat+","+super.tenHang+","+super.chuSoHuu+","+super.namSanXuat+","+this.kieuXe+","+this.soChoNgoi;
    }
}

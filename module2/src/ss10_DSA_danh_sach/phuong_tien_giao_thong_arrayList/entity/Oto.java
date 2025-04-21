package ss10_DSA_danh_sach.phuong_tien_giao_thong_arrayList.entity;

public class Oto extends PhuongTien {
    private String kieuXe;
    private int choNgoi;

    public Oto(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, String kieuXe, int choNgoi) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.kieuXe = kieuXe;
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",kieuXe='" + kieuXe + '\'' +
                ", choNgoi=" + choNgoi;
    }
}

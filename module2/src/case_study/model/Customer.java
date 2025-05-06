package case_study.model;

public class Customer extends Person {
    private String maKhachHang;
    private String loaiKhach;
    private String diaDiem;

    public Customer(String email, String hoTen, String gioiTinh, String ngaySinh, String soCMND, String soDienThoai, String maKhachHang, String diaDiem, String loaiKhach) {
        super(email, hoTen, gioiTinh, ngaySinh, soCMND, soDienThoai);
        this.maKhachHang = maKhachHang;
        this.diaDiem = diaDiem;
        this.loaiKhach = loaiKhach;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
}

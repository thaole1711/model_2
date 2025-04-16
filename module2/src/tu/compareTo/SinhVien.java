package tu.compareTo;

import ss5_access_modifier.bai_tap.student.Student;

public class SinhVien implements Comparable<SinhVien> {
    private int ma;
    private String hoVaten;
    private String tenLop;
    private int diemTrungBinh;

    public SinhVien(String hoVaten, int ma, String tenLop, int diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
        this.hoVaten = hoVaten;
        this.ma = ma;
        this.tenLop = tenLop;
    }

    public int getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(int diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
public String getTen(){
        String str=hoVaten.trim();
        if(str.indexOf(" ")>=0){
            int vt=str.lastIndexOf(" ");
            return str.substring(vt+1);
        }else {
            return str;
    }
}

    @Override
    public String toString() {
        return "SinhVien{" +
                "diemTrungBinh=" + diemTrungBinh +
                ", ma=" + ma +
                ", hoVaten='" + hoVaten + '\'' +
                ", tenLop='" + tenLop + '\'' +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return (this.getTen().compareTo(getTen()));
    }
}

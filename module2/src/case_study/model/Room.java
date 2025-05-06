package case_study.model;

public class Room extends Facility{
    private String dichVuMienPhiDiKem;

    public Room(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", dichVuMienPhiDiKem='" + dichVuMienPhiDiKem ;
    }
}

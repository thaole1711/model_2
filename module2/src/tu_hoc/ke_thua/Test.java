package tu_hoc.ke_thua;

public class Test {
    public static void main(String[] args) {
        ConNguoi conNguoi=new ConNguoi("thao",2000);
        conNguoi.ngu();
        conNguoi.an();
        HocSinh hocSinh=new HocSinh("thu",2001,"a12","codegym");
        hocSinh.an();
        hocSinh.uong();
        hocSinh.lamBaiTap();
        System.out.println(hocSinh.toString());
    }
}

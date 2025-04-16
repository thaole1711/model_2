package tu.compareTo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1=new SinhVien("le thi",1,"a12",8);
        SinhVien sv2=new SinhVien("le",3,"a12",7);
        SinhVien sv3=new SinhVien("le thi thu",3,"a12",7);
       // System.out.println(sv1.compareTo(sv3));
        SinhVien[]sinhViens=new SinhVien[]{sv1,sv2,sv3};
      Arrays.sort(sinhViens);
      for (SinhVien sinhVien:sinhViens){
          System.out.println(sinhVien);
      }
    }
}

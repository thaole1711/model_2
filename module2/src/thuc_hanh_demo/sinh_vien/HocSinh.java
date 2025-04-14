package thuc_hanh_demo.sinh_vien;

import java.util.Scanner;

public class HocSinh {
    Scanner scanner = new Scanner(System.in);
    public static DanhSachHocSinh[] hocSinh = new DanhSachHocSinh[10];

    static {
        hocSinh[0] = new DanhSachHocSinh(1, "Nguyên ");
        hocSinh[1] = new DanhSachHocSinh(2, "Đaị");
        hocSinh[2] = new DanhSachHocSinh(3, "Bình ");

    }


    public void display() {
        for (int i = 0; i < hocSinh.length; i++) {
            if (hocSinh[i] != null) {
                System.out.println(hocSinh[i]);
            } else {
                break;
            }
        }
    }
    public void add(){
        System.out.println("nhập id :");
        int idNew= Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên:");
        String nameNew=scanner.nextLine();
        for (int i = 0; i < hocSinh.length; i++) {
            if(hocSinh[i]==null){
                hocSinh[i]= new DanhSachHocSinh(idNew, nameNew);
                break;
            }
        }
    }
    public void Delete(){
        System.out.println("nhập id học sinh bạn muốn xóa");
        int deleteId= scanner.nextInt();
        boolean flag= false;
        for (int i = 0; i < hocSinh.length; i++) {
            if(hocSinh[i]!=null&&hocSinh[i].getId()==deleteId){
                flag=true;
                for (int j = 0; j < hocSinh.length-1; j++) {
                    hocSinh[j]=hocSinh[j+1];
                }
                hocSinh[hocSinh.length-1]=null;
                System.out.println("đã xóa tên học sinh");
                break;
            }
        }

        if(!flag){
            System.out.println("tên bạn nhập chưa đúng");
        }
    }
}

package thuc_hanh_demo.sinh_vien;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyHocSinh {
    Scanner scanner = new Scanner(System.in);
    public static HocSinh[] hocSinh = new HocSinh[5];

    static {
        hocSinh[0] = new HocSinh(1, "Nguyên ");
        hocSinh[1] = new HocSinh(5, "Dại");
        hocSinh[2] = new HocSinh(3, "Bình ");
        hocSinh[3] = new HocSinh(4, "Thủy ");
        hocSinh[4] = new HocSinh(2, "Khanh ");

    }
    public void display() {
//        Arrays.sort(hocSinh);
        Arrays.sort(hocSinh,new CompareByName());
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
                hocSinh[i]= new HocSinh(idNew, nameNew);
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
    public void update(){
        System.out.println("nhập id ban muon sua");
        int idUpdate=Integer.parseInt(scanner.nextLine());
        boolean flag=false;
        for (int i = 0; i < hocSinh.length; i++) {
            if (hocSinh[i].getId() == idUpdate) {
                System.out.println("nhap ten ban muon sua");
                String nameUpdate = scanner.nextLine();
                hocSinh[i] = new HocSinh(idUpdate, nameUpdate);
                flag = true;
                break;

            }

        }
        if(!flag){
            System.out.println("khong tim thay id ban tim");
        }
    }


}

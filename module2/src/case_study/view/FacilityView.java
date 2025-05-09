package case_study.view;

import case_study.common.RegularExpressionFacility;
import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static Scanner scanner = new Scanner(System.in);

    public static void getAll(Map<Facility,Integer> facilities) {
     for(Map.Entry<Facility,Integer> facilityIntegerEntry:facilities.entrySet()){
         Facility facility = facilityIntegerEntry.getKey();
         Integer integer= facilityIntegerEntry.getValue();
         System.out.println("facility:"+facility+","+"value:"+integer);
     }

    }
    //   public Facility(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue) {
// this.tieuChuanPhong = tieuChuanPhong;
//        this.soTang = soTang;
    public static Facility addHouse() {
        String id = RegularExpressionFacility.checkId(scanner, "nhập mã dịch vụ:", "house");
        String name=RegularExpressionFacility.checkName(scanner,"nhập tên dịch vụ:");
        double area=RegularExpressionFacility.checkArea(scanner,"Nhập diện tích sử dụng:");
        double cost=RegularExpressionFacility.checkCost(scanner,"Nhập chi phí thuê:");
        int people=RegularExpressionFacility.checkPeople(scanner,"nhập số lượng người");
        String rental=RegularExpressionFacility.checkRentalAndStandard(scanner,"Nhập kiểu thuê:");
        String standard=RegularExpressionFacility.checkRentalAndStandard(scanner,"nhập tiêu chuẩn phòng");
        int floor=RegularExpressionFacility.checkfloor(scanner,"nhập số tầng");
        Facility facilityHouse=new House(id,name,area,cost,people,rental,standard,floor);
        return facilityHouse;
    }
    public static Facility addVilla(){
        String id = RegularExpressionFacility.checkId(scanner, "nhập mã dịch vụ:", "villa");
        String name=RegularExpressionFacility.checkName(scanner,"nhập tên dịch vụ:");
        double area=RegularExpressionFacility.checkArea(scanner,"Nhập diện tích sử dụng:");
        double cost=RegularExpressionFacility.checkCost(scanner,"Nhập chi phí thuê:");
        int people=RegularExpressionFacility.checkPeople(scanner,"nhập số lượng người");
        String rental=RegularExpressionFacility.checkRentalAndStandard(scanner,"Nhập kiểu thuê:");
        String standard=RegularExpressionFacility.checkRentalAndStandard(scanner,"nhập tiêu chuẩn phòng");
        double area1=RegularExpressionFacility.checkArea(scanner,"Nhập diện tích hồ bơi:");
        int floor=RegularExpressionFacility.checkfloor(scanner,"nhập số tầng");
        Facility facilityVilla= new Villa(id,name,area,cost,people,rental,standard,area1,floor);
        return facilityVilla;

    }
    public static Facility addRoom(){
        String id = RegularExpressionFacility.checkId(scanner, "nhập mã dịch vụ:", "room");
        String name=RegularExpressionFacility.checkName(scanner,"nhập tên dịch vụ:");
        double area=RegularExpressionFacility.checkArea(scanner,"Nhập diện tích sử dụng:");
        double cost=RegularExpressionFacility.checkCost(scanner,"Nhập chi phí thuê:");
        int people=RegularExpressionFacility.checkPeople(scanner,"nhập số lượng người");
        String rental=RegularExpressionFacility.checkRentalAndStandard(scanner,"Nhập kiểu thuê:");
        System.out.println("dich vụ miễn phí đi kèm:");
        String free=scanner.nextLine();
        Facility facilityRoom= new Room(id,name,area,cost,people,rental,free);
        return facilityRoom;

    }
}

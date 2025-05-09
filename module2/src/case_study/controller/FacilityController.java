package case_study.controller;

import case_study.common.ExceptionManagement;
import case_study.model.Facility;
import case_study.service.FacilityService;
import case_study.view.FacilityView;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static FacilityService facilityService= new FacilityService();
    public static void facilityManagement(){

        boolean flag= true;

        do{
            int number=0;
            System.out.println("FacilityManagement ");
            System.out.println(
                           "\n 1.Display list facility" +
                            "\n 2. Add new facility" +
                            "\n 3. Display list facility maintenance" +
                            "\n 4. Return main menu"
                             );
           number= ExceptionManagement.exception(scanner," chức năng bạn chon là:");
            switch (number){
                case 1:
                  Map<Facility,Integer> facilityIntegerMap=facilityService.getAll();
                    FacilityView.getAll(facilityIntegerMap);
                    break;
                case 2:
                    displayAddFacility();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    flag= false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        }while (flag);
    }
    public static void displayAddFacility(){
        boolean flag=true;
        do {
            int number;
            System.out.println("chọn dịch vụ bạn muốn chọn");
            System.out.println("1. add new villa" +
                    "\n 2. add new house" +
                    "\n 3. add new room" +
                    "\n 4. back to menu");
            number=ExceptionManagement.exception(scanner,"chức năng bạn chọn là:");
            switch (number){
                case 1:
                  Facility facility=  FacilityView.addVilla();
                  facilityService.add(facility);
                    break;
                case 2:
                    Facility facility1=   FacilityView.addHouse();
                    facilityService.add(facility1);
                    break;
                case 3:
                    Facility facility2=  FacilityView.addRoom();
                    facilityService.add(facility2);
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    flag=false;
                    break;
                default:
                    System.out.println("nhap lai so tu 1 den 4");
            }

        }while (flag);
    }
}

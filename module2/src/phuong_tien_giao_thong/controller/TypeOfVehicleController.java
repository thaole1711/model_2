package phuong_tien_giao_thong.controller;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.entity.Motorbike;
import phuong_tien_giao_thong.entity.Truck;
import phuong_tien_giao_thong.service.CarService;
import phuong_tien_giao_thong.service.MotobikeService;
import phuong_tien_giao_thong.service.TruckService;
import phuong_tien_giao_thong.view.ViewCar;
import phuong_tien_giao_thong.view.ViewMotobike;
import phuong_tien_giao_thong.view.ViewTruck;

import java.util.Scanner;

public class TypeOfVehicleController {
    public static Scanner scanner = new Scanner(System.in);

    public void display() {
        ViewCar viewCar = new ViewCar();
        ViewTruck viewTruck = new ViewTruck();
        ViewMotobike viewMotobike = new ViewMotobike();
        boolean flag = true;
        do {
            System.out.println("ban muon chon xe:" +
                    "\n 1.oto" +
                    "\n 2.tai" +
                    "\n 3.may" +
                    "\n 4.thoat");
            System.out.println("nhap so ban chon :");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    viewCar.carView();
                    break;
                case 2:
                    viewTruck.truckView();
                    break;
                case 3:
                    viewMotobike.motobikeView();
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    flag = false;
                    System.out.println("ban hay chon tu 1 den 4");
            }
        } while (flag);
    }

    public void add() {
        ViewCar viewCar = new ViewCar();
        CarService carService = new CarService();
        ViewMotobike viewMoto = new ViewMotobike();
        MotobikeService motobikeService = new MotobikeService();
        ViewTruck viewTruck= new ViewTruck();
        TruckService truckService= new TruckService();
        boolean flag = true;
        do {
            System.out.println("ban muon chon xe:" +
                    "\n 1.oto" +
                    "\n 2.tai" +
                    "\n 3.may" +
                    "\n 4.thoat");
            System.out.println("nhap so ban chon :");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    Car car = viewCar.addCar();
                    carService.add(car);
                    break;
                case 2:
                    Motorbike motorbike =viewMoto.addMotobike();
                    motobikeService.add(motorbike);
                    break;
                case 3:
                    Truck truck= viewTruck.addTruck();
                    truckService.add(truck);
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    flag = false;
                    System.out.println("ban hay chon tu 1 den 4");
            }
        } while (flag);
    }

    public void delete() {
        CarService carService = new CarService();
        MotobikeService motobikeService = new MotobikeService();
        TruckService truckService= new TruckService();
        boolean flag = true;
        do {
            System.out.println("ban muon xoa xe:" +
                    "\n 1.oto" +
                    "\n 2.tai" +
                    "\n 3.may" +
                    "\n 4.thoat");
            System.out.println("nhap so ban chon :");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap bien so xe ban muon xoa :");
            String numberPlate = scanner.nextLine();

            switch (number) {
                case 1:
                    carService.delete(numberPlate);
                    break;
                case 2:
                    truckService.delete(numberPlate);
                    break;
                case 3:
                    motobikeService.delete(numberPlate);
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    flag = false;
                    System.out.println("ban hay chon tu 1 den 4");
            }
        } while (flag);
    }

}

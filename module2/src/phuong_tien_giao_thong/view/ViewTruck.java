package phuong_tien_giao_thong.view;

import phuong_tien_giao_thong.entity.Truck;
import phuong_tien_giao_thong.repository.TruckRepository;

import java.util.Scanner;

public class ViewTruck {
    public static Scanner scanner = new Scanner(System.in);

    public void truckView() {
        TruckRepository truckRepo = new TruckRepository();
        Truck[] trucks = truckRepo.findAll();
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
            if (trucks[i] == null) {
                break;
            }

        }

    }
    public static Truck addTruck() {
        System.out.println("nhap bien kiem soat xe oto:");
        String plateNew = scanner.nextLine();
        System.out.println("nhap hang san xuat xe oto:");
        String brandNew = scanner.nextLine();
        System.out.println("nhap nam san xuat oto:");
        int yearNew = Integer.parseInt(scanner.nextLine());
        System.out.println("ten chu so huu:");
        String nameNew = scanner.nextLine();
        System.out.println("Trong tai la:");
        double newPayload = scanner.nextInt();
        Truck truck = new Truck(plateNew, brandNew, yearNew, nameNew, newPayload);
        return truck;
    }

    public void delete(String numberPlate) {
        TruckRepository truckRepo = new TruckRepository();
        truckRepo.delete(numberPlate);
    }

}





package phuong_tien_giao_thong.view;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.repository.CarRepository;

import java.util.Scanner;

public class ViewCar {
    public static Scanner scanner=new Scanner(System.in);
    public void carView() {
        CarRepository carRepo = new CarRepository();
        Car[] cars = carRepo.findAll();
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            if (cars[i] == null) {
                break;
            }
        }
    }
    public static Car addCar(){
        System.out.println("nhap bien kiem soat xe oto:");
        String plateNew= scanner.nextLine();
        System.out.println("nhap hang san xuat xe oto:");
        String brandNew=scanner.nextLine();
        System.out.println("nhap nam san xuat oto:");
        int yearNew=Integer.parseInt(scanner.nextLine());
        System.out.println("ten chu so huu:");
        String nameNew=scanner.nextLine();
        System.out.println("kieu xe la:");
        String typeNew=scanner.nextLine();
        System.out.println("so cho ngoi la:");
        int newSeatCapacity=scanner.nextInt();
        Car car = new Car(plateNew, brandNew, yearNew, nameNew, typeNew, newSeatCapacity);
        return car;
}
    public void delete(String numberPlate) {
        CarRepository carRepo = new CarRepository();
         carRepo.delete(numberPlate);
    }
}

package phuong_tien_giao_thong.view;

import phuong_tien_giao_thong.entity.Motorbike;
import phuong_tien_giao_thong.repository.MotorbikeRepository;

import java.util.List;
import java.util.Scanner;

public class ViewMotobike {
    public static Scanner scanner = new Scanner(System.in);

    public void motobikeView() {
        MotorbikeRepository motorbikeRepos = new MotorbikeRepository();
        List<Motorbike> motorbikes = motorbikeRepos.findAll();
        for (Motorbike motorbike : motorbikes){
            System.out.println(motorbike);
        }
    }
    public static Motorbike addMotobike() {
        System.out.println("nhap bien kiem soat xe máy:");
        String plateNew = scanner.nextLine();
        System.out.println("nhap hang san xuat xe máy:");
        String brandNew = scanner.nextLine();
        System.out.println("nhap nam san xuat máy:");
        int yearNew = Integer.parseInt(scanner.nextLine());
        System.out.println("ten chu so huu:");
        String nameNew = scanner.nextLine();
        System.out.println("cong suat la");
        double newPower = scanner.nextInt();
        Motorbike motorbike = new Motorbike(plateNew, brandNew, yearNew, nameNew, newPower);
        return motorbike;
    }

    public void delete(String numberPlate) {
        MotorbikeRepository motorbikeRepos = new MotorbikeRepository();
        motorbikeRepos.delete(numberPlate);
    }

}







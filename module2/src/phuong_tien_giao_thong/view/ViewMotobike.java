package phuong_tien_giao_thong.view;

import phuong_tien_giao_thong.entity.Motorbike;
import phuong_tien_giao_thong.repository.MotorbikeRepository;

import java.util.Scanner;

public class ViewMotobike {
    public static Scanner scanner =new Scanner(System.in);
    public void motobikeView(){
        MotorbikeRepository motorbikeRepos= new MotorbikeRepository();
        Motorbike[] motorbike=motorbikeRepos.findAll();
        for (int i = 0; i < motorbike.length; i++) {
            System.out.println(motorbike[i]);
            if(motorbike[i]==null){
                break;
            }

        }
    }
    public static Motorbike addMotobike(){
        System.out.println("nhap bien kiem soat xe oto:");
        String plateNew= scanner.nextLine();
        System.out.println("nhap hang san xuat xe oto:");
        String brandNew=scanner.nextLine();
        System.out.println("nhap nam san xuat oto:");
        int yearNew=Integer.parseInt(scanner.nextLine());
        System.out.println("ten chu so huu:");
        String nameNew=scanner.nextLine();
        System.out.println("cong suat la");
        double newPower=scanner.nextInt();
        Motorbike motorbike = new Motorbike(plateNew, brandNew, yearNew, nameNew, newPower);
        return motorbike;
    }

    public void delete(String numberPlate) {
        MotorbikeRepository motorbikeRepos = new MotorbikeRepository();
        motorbikeRepos.delete(numberPlate);
    }
}

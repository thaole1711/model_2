package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    double width, height;

    public LopHinhChuNhat() {
    }

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPreimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "rectangle{" + "width" + width + ",height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        LopHinhChuNhat dienTich = new LopHinhChuNhat(width, height);
        System.out.println("hienthi :" + dienTich.display());
        System.out.println("dientich:" + dienTich.getPreimeter());
        System.out.println("chuvi:" + dienTich.getArea());

    }


}


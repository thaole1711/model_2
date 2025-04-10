package ss4_class_object.bai_tap.bai_1_phuong_trinh_bac_2;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị của a:");
        double a=scanner.nextDouble();
        System.out.println("nhập giá trị của b:");
        double b=scanner.nextDouble();
        System.out.println("nhập giá trị của c:");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("phương trình có 2 nghiệm"+"\t");
            System.out.println("nghiệm 1 là:"+quadraticEquation.getRoot1()+"\t");
            System.out.println("nghiệm 2 là:"+quadraticEquation.getRoot2()+"\t");
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("phương trình có nghiệm kép là:"+quadraticEquation.getRoot3());
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}

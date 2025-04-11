package ss5_access_modifier.bai_tap.QuanLySua;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ProductManagement typeOfMilk=new ProductManagement();

        byte number;
        boolean flag=true;
        do {
            System.out.println("menu");
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.search");
            System.out.println("6. exit");
            System.out.println("nhập số bạn muốn chọn");
            number=scanner.nextByte();
            switch (number){
                case 1:
                    typeOfMilk.Display();
                    break;
                case 2:
                    typeOfMilk.Add();
                    typeOfMilk.Display();;
                    break;
                case 3:
                    typeOfMilk.Update();
                    typeOfMilk.Display();
                    break;
                case 4:
                    typeOfMilk.Delete();
                    typeOfMilk.Display();
                    break;
                case 5:
                    typeOfMilk.Search();
                case 6:
                    System.out.println("thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("hãy chọn từ 1 đến 5");
            }

        }while (flag);
    }
}

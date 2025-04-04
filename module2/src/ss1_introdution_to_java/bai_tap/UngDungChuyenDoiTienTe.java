package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("bạn muốn đổi từ USD hay VND");
        String from = scanner.nextLine();
        System.out.println("sang");
        String to = scanner.nextLine();
        if (from.equals("USD") && to.equals("VND")) {
            System.out.println("sô tiền là: " + amount * rate + "đồng");
        } else if (from.equals("VND") && to.equals("USD")) {
            System.out.println("số tiền là; " + amount / rate + "đôla");
        } else {
            System.out.println("chưa hỗ trợ ");
        }


    }
}

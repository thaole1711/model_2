package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string="le thu thao";
        System.out.println("nhap 1 ki tu:");
        String character=scanner.nextLine();
        char charString=character.charAt(0);
        char[] charArray= string.toCharArray();
        int count=0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]==charString){
                count++;
            }
        }
        System.out.println("so lan ki tu xuat hien trong chuoi la :"+count);
    }
}

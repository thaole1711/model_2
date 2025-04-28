package s13_thuat_toan_tim_kiem.bai_tap.Tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi:");
        String string = scanner.nextLine();
        List<Character> characterList = new ArrayList<>();
        List<Character> maxCharacterList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            characterList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > characterList.get(characterList.size() - 1)) {
                    characterList.add(string.charAt(j));
                }
            }
            if (maxCharacterList.size() < characterList.size()) {
                maxCharacterList.clear();
                maxCharacterList.addAll(characterList);

            }
            characterList.clear();
        }

        for (Character character : maxCharacterList) {
            System.out.print(character);
        }
    }
}

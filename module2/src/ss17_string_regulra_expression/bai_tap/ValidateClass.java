package ss17_string_regulra_expression.bai_tap;

public class ValidateClass {
    public static void main(String[] args) {
        String[] nameOK = new String[]{"C0223G", "A0323K"};
        String[] name = new String[]{"M0318G", "P0323A"};
        String regexname = "^[ACP]\\d{4}[GHIK]$";
        for (int i = 0; i < nameOK.length; i++) {
            boolean check = nameOK[i].matches(regexname);
            System.out.println("tên lớp đúng:" + check);
        }

        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].matches(regexname);
            System.out.println("tên lớp sai:" + check);
        }

    }
}

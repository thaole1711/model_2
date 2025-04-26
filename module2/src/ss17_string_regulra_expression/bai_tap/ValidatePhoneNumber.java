package ss17_string_regulra_expression.bai_tap;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String phoneNumberOk = "(84)-(0978489648)";
        String[] phoneNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        String regexnumber = "^[(]\\d{2}[)]-[(]0\\d{9}$[)]";
        boolean check = phoneNumberOk.matches(regexnumber);
        System.out.println(check);
        for (int i = 0; i < phoneNumber.length; i++) {
            boolean check1 = phoneNumber[i].matches(regexnumber);
            System.out.println("số thứ" + i + ":" + check1);
        }

    }
}

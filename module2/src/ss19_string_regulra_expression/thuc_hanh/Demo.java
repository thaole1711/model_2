package ss19_string_regulra_expression.thuc_hanh;

public class Demo {
    public static void main(String[] args) {
        String name = "A Thay";
        String regexName= "^([A-Z][a-z]*)(\\s[A-Z][a-z]*])?(\\s[A-Z][a-z]*)+$";
        boolean check= name.matches(regexName);
        System.out.println(check);
    }
}

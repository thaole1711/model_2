package ss6_inheritance.bai_tap.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle(3,"red");
        System.out.println("hình tròn:");
        System.out.println( circle.toString());
        Cylinder cylinder= new Cylinder(5,"yellow",4);
        System.out.println("hình trụ");
        System.out.println(cylinder);
        System.out.println("diện tích hình trụ là:"+cylinder.area());
        System.out.println("thể tích hình trụ là:"+cylinder.volume());
    }
}

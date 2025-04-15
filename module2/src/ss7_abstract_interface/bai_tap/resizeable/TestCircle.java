package ss7_abstract_interface.bai_tap.resizeable;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(1);
        System.out.println( circle);
        circle.resize(100);
        System.out.println( circle);
    }
}

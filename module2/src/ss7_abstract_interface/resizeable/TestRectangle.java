package ss7_abstract_interface.resizeable;

public class TestRectangle {
    public static void main(String[] args) {
       Rectangle rectangle=new Rectangle(3,4);
        System.out.println(rectangle);
        rectangle.resize(10);
        System.out.println(rectangle);
    }
}

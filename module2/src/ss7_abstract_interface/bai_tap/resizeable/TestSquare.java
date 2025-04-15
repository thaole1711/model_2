package ss7_abstract_interface.bai_tap.resizeable;

public class TestSquare {
    public static void main(String[] args) {
       Square square= new Square(2);
        System.out.println(square);
        square.resize(50);
        System.out.println(square);
    }
}

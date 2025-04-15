package ss7_abstract_interface.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("circle:" + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("rectangle:" + ((Rectangle) shape).getArea());
            } else {
                System.out.println("Shapes:" + ((Square) shape).getArea());
                ( (Square) shape).howToColor() ;
            }

        }
    }
}

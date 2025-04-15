package ss7_abstract_interface.resizeable;

public class Square extends Shape implements Resizeable{
    private double side=1.0;
    public Square() {
    }
    public Square(double side){
        this.side=side;
    }
    public Square(String color, boolean filled) {
        super(color, filled);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square(" +
                "side=" + side +
                "area="+ getArea()+
                "perimeter="+ getPerimeter()+
                super.toString()+')';
    }

    @Override
    public void resize(double percent) {
        setSide(side*(1+percent/100));
    }
}

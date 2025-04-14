package ss6_inheritance.bai_tap.circle;

public class Cylinder extends Circle {
    double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return 2 * super.area() + 2 * Math.PI * super.getRadius() * getHeight();
    }
    public double volume() {
        return super.getRadius() * super.getRadius() * Math.PI * height;
    }
    @Override
    public String toString() {
        return super.toString() + ", hight :" + height;
    }
}

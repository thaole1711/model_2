package ss5_access_modifier.bai_tap.access_modifier;

public class Circle {
    private double radius=1.0;
    private String color="red";
    public void Circle(){

    }
    public void Circle(double radius){

    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

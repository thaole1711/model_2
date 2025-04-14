package ss6_inheritance.bai_tap.circle;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
      return Math.PI*getRadius()*getRadius()  ;
    }
    @Override
    public String toString() {
        return "Circle :" +
                "color='" + color + '\'' +
                ", radius=" + radius ;
    }
}

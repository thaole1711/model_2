package ss4_class_object.bai_tap.bai_3_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.isOn = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return this.speed;
    }
    public boolean getOn() {
        return this.isOn;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.isOn=on;
    }
    public void setRadius(double radius){
    this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        String statusFan = this.isOn ? "Fan{" +
                "speed=" + speed +
                ", Fan is on" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}' : "Fan{" +
                "Fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
        return statusFan;

    }

}

package ss6_inheritance.bai_tap.point2D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 3);
        System.out.println("point2D là :" + point2D);
        Point3D point3D = new Point3D(3);
        System.out.println("point3D là:" + point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}

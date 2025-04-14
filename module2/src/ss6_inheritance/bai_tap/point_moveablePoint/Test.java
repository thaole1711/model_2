package ss6_inheritance.bai_tap.point_moveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point=new Point(3,4);
        System.out.println("point:"+point);
        MovablePoint movablePoint= new MovablePoint(1,2,3,4);
        System.out.println("movablePoint:"+movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
    }
}

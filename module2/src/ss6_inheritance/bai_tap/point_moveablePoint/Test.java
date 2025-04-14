package ss6_inheritance.bai_tap.point_moveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point=new Point(3,4);
        System.out.println("point:"+point.toString());
        MovablePoint movablePoint= new MovablePoint(1,2,3,4);
        System.out.println("movablePoint:"+movablePoint.toString());
    }
}

package ss6_inheritance.bai_tap.point2D;

public class Point3D extends Point2D{
    private float z=0.0f;
    public Point3D() {
    }
    public Point3D(float z) {
        super(1, 2);
        this.z=z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
       setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ() {
        return new float[] {x,y,z};
    }
    @Override
    public String toString() {
        return "Point3D(" +x +","+y+","+z+")";
    }
}

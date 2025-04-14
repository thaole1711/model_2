package ss6_inheritance.bai_tap.point2D;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXy(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXy() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point2D(" + x + "," + y + ')';
    }
}


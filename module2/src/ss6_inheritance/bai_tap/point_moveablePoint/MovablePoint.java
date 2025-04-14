package ss6_inheritance.bai_tap.point_moveablePoint;

public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    public MovablePoint(float x, float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[]getSpeed(float xSpeed,float ySpeed){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return super.toString()+", speed =("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        super.setX(super.getX()+ getXSpeed());
        super.setY(super.getY()+getYSpeed());
        return this;
    }
}

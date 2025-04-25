package phuong_tien_giao_thong.entity;

public class Motorbike extends Traffic {
private  double power;

    public Motorbike(String numberPlate, String brandName, int manufactureYear, String userName, double power) {
        super(numberPlate, brandName, manufactureYear, userName);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",power=" + power
                ;
    }
    public String getInfoToFileMotobike(){
        return super.numberPlate+","+super.brandName+","+super.manufactureYear+","+super.userName+","+this.power;
    }
}

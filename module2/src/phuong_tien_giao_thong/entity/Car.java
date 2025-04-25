package phuong_tien_giao_thong.entity;

public class Car extends Traffic {
    private int seatCapacity;
    private String type;

    public Car(String numberPlate, String brandName, int manufactureYear, String userName,  String type,int seatCapacity) {
        super(numberPlate, brandName, manufactureYear, userName);
        this.seatCapacity = seatCapacity;
        this.type = type;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",seatCapacity=" + seatCapacity +
                ", type=" + type + '\n';
    }
    public String getInfoToFileCar(){
        return super.numberPlate+","+super.brandName+","+super.manufactureYear+","+super.userName+","+this.type + "," + this.seatCapacity;
    }
}

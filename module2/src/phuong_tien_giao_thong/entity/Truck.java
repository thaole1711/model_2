package phuong_tien_giao_thong.entity;

public class Truck extends Traffic {
    private double payload;

    public Truck(String numberPlate, String brandName, int manufactureYear, String userName, double payload) {
        super(numberPlate, brandName, manufactureYear, userName);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",payload=" + payload;
    }
    public String getInfoToFileTruck(){
        return super.numberPlate+","+super.brandName+","+super.manufactureYear+","+super.userName+","+this.payload;
    }
}

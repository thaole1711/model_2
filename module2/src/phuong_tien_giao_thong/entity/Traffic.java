package phuong_tien_giao_thong.entity;

public abstract class Traffic {
    protected  String numberPlate,brandName,userName;
    protected int manufactureYear;

    public Traffic(String numberPlate, String brandName, int manufactureYear, String userName ) {
        this.brandName = brandName;
        this.manufactureYear = manufactureYear;
        this.numberPlate = numberPlate;
        this.userName = userName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return
                "brandName='" + brandName + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", userName='" + userName + '\'' +
                ", manufactureYear=" + manufactureYear
                ;
    }
}

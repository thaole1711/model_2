package hoa_don_tien_dien.model;

public class VietNamCustomer extends Customer {
    private String typeOfCustomer;
    private String electricityConsumption;

    public VietNamCustomer(String idCustomer, String nameCustomer, String typeOfCustomer, String electricityConsumption) {
        super(idCustomer, nameCustomer);
        this.typeOfCustomer = typeOfCustomer;
        this.electricityConsumption = electricityConsumption;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(String electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    @Override
    public String toString() {
        return super.toString()+","+
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", electricityConsumption='" + electricityConsumption ;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ","+this.typeOfCustomer+","+this.electricityConsumption;
    }
}

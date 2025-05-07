package case_study.model;

public class Customer extends Person {
    private String idCustomer;
    private String customerType;
    private String address;

    public Customer(String fullName, String date, String gender, String IDNumber, String phoneNumber, String email, String address, String customerType, String idCustomer) {
        super(fullName, date, gender, IDNumber, phoneNumber, email);
        this.address = address;
        this.customerType = customerType;
        this.idCustomer = idCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", maKhachHang='" + idCustomer + '\'' +
                ", loaiKhach='" + customerType + '\'' +
                ", diaDiem='" + address + '\'' ;
    }
    public  String getInForCustomer(){
        return super.getInfor()+","+this.idCustomer +","+this.customerType +","+this.address;
    }
}

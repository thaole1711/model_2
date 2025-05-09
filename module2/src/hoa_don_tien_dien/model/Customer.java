package hoa_don_tien_dien.model;

public abstract class Customer {
 protected    String idCustomer;
    protected String nameCustomer;

    public Customer(String idCustomer, String nameCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    @Override
    public String toString() {
        return "idCustomer=" + idCustomer +
                ", nameCustomer='" + nameCustomer ;
    }
    public String getInfo(){
        return this.idCustomer+","+this.nameCustomer;
    }
}

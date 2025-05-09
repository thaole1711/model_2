package hoa_don_tien_dien.model;

public class ForeignCustomer extends Customer{
    private String nationality;

    public ForeignCustomer(String idCustomer, String nameCustomer, String nationality) {
        super(idCustomer, nameCustomer);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return super.toString()+"," +
                "nationality='" + nationality ;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+","+this.nationality;
    }
}

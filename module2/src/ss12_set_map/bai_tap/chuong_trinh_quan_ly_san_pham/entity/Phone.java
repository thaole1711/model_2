package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity;

public class Phone {
    private int id;
    private String name;
    private double price ;

    public Phone(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Phone() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name=" + name +
                ", price=" + price;
    }


}

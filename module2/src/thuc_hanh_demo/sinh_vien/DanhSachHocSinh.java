package thuc_hanh_demo.sinh_vien;

public class DanhSachHocSinh {
    private int id;
    private String name;
public DanhSachHocSinh(int id, String name){
    this.id=id;
    this.name=name;
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
        this.name = name;
    }

    @Override
    public String toString() {
        return "DanhSachHocSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

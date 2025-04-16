package thuc_hanh_demo.sinh_vien;

public class HocSinh implements Comparable<HocSinh>{
    private int id;
    private String name;
public HocSinh(int id, String name){
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
        return "HocSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(HocSinh o) {
      return this.id-o.id;
    }
}

package tu_hoc.ke_thua;

public class ConNguoi {
    private String hoVaTen;
   protected int namSinh;
    public ConNguoi(String hoVaTen,int namSinh){
        this.hoVaTen=hoVaTen;
        this.namSinh=namSinh;
    }
    public void an(){
        System.out.println("ăn cơm");
    }
    public void uong(){
        System.out.println("uống nước");
    }
    public void ngu(){
        System.out.println("zzzzzz");
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    @Override
    public String toString() {
        return "ConNguoi{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}

package ss15_exception_error.bai_tap.IIIegalTriangleException;

public class Trianggle {
    private int a;
    private int b;
    private int c;

    public Trianggle(int a, int b, int c) {
        if(a<=0||b<=0||c<=0){
            System.out.println("không được nhập là số âm");
        }else if(a+b<c||a+c<b||c+b<a){
            System.out.println("tổng hai cạnh không được nhỏ hơn một cạnh");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

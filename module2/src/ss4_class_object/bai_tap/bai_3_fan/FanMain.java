package ss4_class_object.bai_tap.bai_3_fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1=new Fan(3,true,10,"yellow");
        Fan fan2= new Fan(2,false,5,"blue");
        System.out.println("fan1"+fan1.toString());
        System.out.println("fan2"+fan2.toString());
    }
}

package case_study.model;

public class Employee extends Person {
    private  String IdEmployee;
    private String level;
    private String position;
    private double salary;

    public Employee(String fullName, String date, String gender, String IDNumber, String phoneNumber, String email, String idEmployee, String level, String position, double salary) {
        super(fullName, date, gender, IDNumber, phoneNumber, email);
        IdEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public  String getIdEmployee() {
        return IdEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.IdEmployee = idEmployee;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                ",maNhanVien=" + IdEmployee +
                ", trinhDo='" + level + '\'' +
                ", viTri='" + position + '\'' +
                ", luong=" + salary;
    }
    public String getInfor(){
        return super.getInfor()+","+this.IdEmployee +","+this.level +","+this.position +","+this.salary;
    }
}

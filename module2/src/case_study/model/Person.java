package case_study.model;

public abstract class Person {
    private String fullName;
    private String date;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String email;

    public Person(String fullName, String date, String gender, String idNumber, String phoneNumber, String email) {
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "hoTen='" + fullName + '\'' +
                ", ngaySinh='" + date + '\'' +
                ", gioiTinh='" + gender + '\'' +
                ", soCMND='" + idNumber + '\'' +
                ", soDienThoai='" + phoneNumber + '\'' +
                ", email='" + email + '\''
                ;
    }

    public String getInfor(){
        return this.fullName +","+this.date +","+this.gender +","+this.idNumber +","+this.phoneNumber +","+this.email;
    }
}

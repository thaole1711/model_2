package tu.quan_li_sinh_vien.entity;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id ,fullName;
    private int yearOfBrith;
    private double average;

    public Student(String id, String fullName, int yearOfBrith, double average) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBrith = yearOfBrith;
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBrith() {
        return yearOfBrith;
    }

    public void setYearOfBrith(int yearOfBrith) {
        this.yearOfBrith = yearOfBrith;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", yearOfBrith=" + yearOfBrith +
                ", average=" + average;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.average-o.average);
    }
}

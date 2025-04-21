package tu.quan_li_sinh_vien.repository;

import tu.quan_li_sinh_vien.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }


    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);

    }

    public void displayStudent() {
        for (Student student1 : students) {
            System.out.println(student1);
        }
    }

    public boolean ckeckEmpty() {
        return this.students.isEmpty();
    }

    public int quantity() {
        return this.students.size();
    }

    public void empty() {
        this.students.removeAll(students);
    }

    public boolean contain(String std) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(std)) {
                return true;
            }
        }
        return false;
    }

    public void delete(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                System.out.println("bạn đã xóa học sinh " + students.get(i).getFullName());
            } else {
                System.out.println("không có id bạn tìm");
            }
        }
    }

    public Student tenSeach(String name) {
        for (Student student : students) {
           if( student.getFullName().equals(name)) {
               return student;
            }
        }
        return null;
    }
    public  List<Student> sortStudent(){
        Collections.sort(students);
       return students;
    }

}

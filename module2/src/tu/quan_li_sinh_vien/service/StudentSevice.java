package tu.quan_li_sinh_vien.service;

import tu.quan_li_sinh_vien.entity.Student;
import tu.quan_li_sinh_vien.repository.StudentRepository;

import java.util.List;

public class StudentSevice {
    private StudentRepository studentRepository=new StudentRepository();
    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }
    public void display(){
        studentRepository.displayStudent();
    }
    public boolean checkEmpty(){
       return studentRepository.ckeckEmpty();
    }
    public int quantity(){
      return studentRepository.quantity();
    }
    public void empty(){
        studentRepository.empty();

    }
    public boolean contain(String student1) {
        return studentRepository.contain(student1);

    }
    public void delete(String id){
        studentRepository.delete(id);

    }
    public Student tenSeach(String name){
        return studentRepository.tenSeach(name);
    }
    public List<Student> sortStudent(){
        return  studentRepository.sortStudent();
    }
}

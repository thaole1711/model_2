package demo.repository;


import demo.entity.Student;

public interface IStudentRepository {
    Student[] findAll();
    void add(Student student);
    Student findById(int id);
    void update(int id, Student student);

}

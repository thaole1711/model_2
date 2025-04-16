package demo.service;

import demo.entity.Student;

public interface IStudentService {
    Student[] findAll();
    void add(Student student);
}

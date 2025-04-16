package demo.service;

import demo.entity.Student;
import demo.repository.IStudentRepository;
import demo.repository.StudentRepository;


public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }
}

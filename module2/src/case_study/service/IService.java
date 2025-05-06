package case_study.service;

import java.util.List;

public interface IService <T>{
    List<T> findAll();
    void update(T t);
    void add(T t);
    boolean findId(String id);
    void delete(String id);

}

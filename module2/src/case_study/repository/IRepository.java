package case_study.repository;

import java.util.List;

public interface IRepository <T>{
    List<T> findAll();
    void update(T t);
    void add(T t);
    boolean findId( String id);
    void delete( String id);
}

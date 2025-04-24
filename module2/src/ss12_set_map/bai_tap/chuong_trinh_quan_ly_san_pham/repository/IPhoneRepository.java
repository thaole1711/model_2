package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;

import java.util.List;

public interface IPhoneRepository {
    void add(Phone phone);
    void update(Phone phone);
    boolean delete(int id);
    List<Phone> findAll() ;
    void seach(String name);
    void increaseSort();
    void decreaseSort();
    void findId(int id);
}

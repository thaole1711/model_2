package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;

public interface IPhoneRepository {
    void add(Phone phone);
    void update(Phone phone);
    void delete(int id);
    void display();
    void seach(String name);
    void increaseSort();
    void decreaseSort();
    void findId(int id);
}

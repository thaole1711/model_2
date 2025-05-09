package ghi_file_quan_li_san_pham.repository;

import ghi_file_quan_li_san_pham.entity.Oto;
import ghi_file_quan_li_san_pham.entity.XeMay;

import java.util.List;

public interface IXeMayRepository {
    List<XeMay> findAll();
    void add(XeMay xeMay);
    void delete(String id);
    void update(XeMay xeMay);
    boolean findId(String id);
    void seach(String id);
}

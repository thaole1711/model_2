package ghi_file_quan_li_san_pham.repository;

import ghi_file_quan_li_san_pham.entity.Oto;

import java.util.List;

public interface IOtoRepository {
    List<Oto> findAll();
     void add( Oto oto);
     void delete(int id);
     void update(Oto oto);
     void seach();
     boolean findId(String bienSo);
}

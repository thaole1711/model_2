package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Motorbike;

import java.util.List;

public interface IMotobikeService {
   List<Motorbike>findAll();
    void add(Motorbike motorbike);
    void display(Motorbike motorbike);
    void delete(String numberPlate);

}

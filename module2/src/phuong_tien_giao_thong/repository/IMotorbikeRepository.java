package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Motorbike;

import java.util.List;

public interface IMotorbikeRepository {
   List <Motorbike> findAll();
    void add(Motorbike motorbike);
    boolean delete(String numberPlate);
}

package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Motorbike;

public interface IMotorbikeRepository {
    Motorbike[] findAll();
    void add(Motorbike motorbike);
    void delete(String numberPlate);
}

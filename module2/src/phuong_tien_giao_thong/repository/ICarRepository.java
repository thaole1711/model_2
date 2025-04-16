package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;

public interface ICarRepository {
    Car[] findAll();
    void add(Car car);
  void delete(String bienSoXe);
}

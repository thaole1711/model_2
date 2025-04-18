package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> findAll();
    void add(Car car);
  void delete(String bienSoXe);
}

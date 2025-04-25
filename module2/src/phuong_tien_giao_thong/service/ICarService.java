package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    void add(Car car);

    void delete(String numberPlate);
}

package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Car;

public interface ICarService {
    Car[]  findAll();
    void add(Car car);
    void display(Car car);
    void delete(Car car);
}

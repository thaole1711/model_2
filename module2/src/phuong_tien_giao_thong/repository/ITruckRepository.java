package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Truck;

public interface ITruckRepository {
    Truck[] findAll();
    void add(Truck truck);
    void display(Truck truck);
    void delete(Truck truck);
}

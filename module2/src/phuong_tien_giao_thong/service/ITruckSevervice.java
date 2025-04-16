package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Truck;

public interface ITruckSevervice {
    Truck[] findAll();
    void add(Truck truck);
    void display(Truck truck);
    void delete(String numberPlate);
}

package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Truck;

import java.util.List;

public interface ITruckSevervice {
    List<Truck> findAll();
    void add(Truck truck);

    void delete(String numberPlate);
}

package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Truck;

import java.util.List;

public interface ITruckRepository {
   List<Truck> findAll();
    void add(Truck truck);
    boolean delete(String trucks);
}

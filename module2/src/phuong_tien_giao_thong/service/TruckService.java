package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.entity.Truck;
import phuong_tien_giao_thong.repository.ICarRepository;
import phuong_tien_giao_thong.repository.ITruckRepository;
import phuong_tien_giao_thong.repository.TruckRepository;

public class TruckService implements ITruckSevervice {
    private ITruckRepository truckRepository= new TruckRepository();
    @Override
    public Truck[] findAll() {
        return  truckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);

    }

    @Override
    public void display(Truck truck) {

    }

    @Override
    public void delete(Truck truck) {

    }

}

package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.repository.CarRepository;
import phuong_tien_giao_thong.repository.ICarRepository;

public class CarService implements ICarService{
private ICarRepository carRepositoryarRepository= new CarRepository();
    @Override
    public Car[] findAll() {
        return carRepositoryarRepository.findAll();
    }

    @Override
    public void add(Car car) {
     carRepositoryarRepository.add(car);
    }

    @Override
    public void display(Car car) {

    }

    @Override
    public void delete(String  numberPlate) {
        carRepositoryarRepository.delete(numberPlate);
    }
}

package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository{
    private static List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car("43A-212.56","toyota",2019,"Nguyen Van A","du lich",5)) ;
        listCar.add(new Car("43B-453.88","Huyndai",2020,"Nguyen Van B","xe khach",35)) ;
        listCar.add(new Car("43C-453.89","Ford",2021,"Nguyen Van C","xe khach",16));
    }


    @Override
    public List<Car> findAll() {
        return listCar;
    }

    @Override
    public void add(Car car) {
        listCar.add(car);

    }

    @Override
    public void delete(String numberPlate) {
        Car carByNumberPlate = findCarByNumberPlate(numberPlate);
        if(carByNumberPlate !=null){
            listCar.remove(carByNumberPlate);
            System.out.println("xoa thanh cong");
        }else{
            System.out.println("Khong tim thay bang so xe");
        }
    }

    public  Car findCarByNumberPlate(String numberPlate){
        for (int i = 0; i < listCar.size(); i++) {
            if(listCar.get(i).getNumberPlate().equals(numberPlate)){
                return listCar.get(i);
            }
        }
        return null;
    }

}



package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;

public class CarRepository implements ICarRepository{
    private static Car[] cars=new Car[5];
    static {
        cars[0]= new Car("43A-212.56","toyota",2019,"Nguyen Van A","du lich",5);
        cars[1]= new Car("43B-453.88","Huyndai",2020,"Nguyen Van B","xe khach",35);
        cars[2]= new Car("43C-453.89","Ford",2021,"Nguyen Van C","xe khach",16);
    }

    @Override
    public Car[] findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if(cars[i]==null){
                cars[i]=car;
                break;
            }
        }
    }

    @Override
    public void delete(String numberPlate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getNumberPlate().equals(numberPlate)) {
                for (int j = i; j < cars.length - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                cars[cars.length - 1] = null;
                System.out.println("Phương tiện với biển kiểm soát " + numberPlate + " đã xoá thành công.");
                return;
            }
        }
        System.out.println("Phương tiện với biển kiểm soát " + numberPlate + " không tìm thấy.");
    }
}




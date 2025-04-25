package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
//    private static List<Car> listCar = new ArrayList<>();
//
//    static {
//        listCar.add(new Car("43A-212.56","toyota",2019,"Nguyen Van A","du lich",5)) ;
//        listCar.add(new Car("43B-453.88","Huyndai",2020,"Nguyen Van B","xe khach",35)) ;
//        listCar.add(new Car("43C-453.89","Ford",2021,"Nguyen Van C","xe khach",16));
//    }

    public final String CAR_FILE = "D:\\codegym\\module2\\module2\\src\\phuong_tien_giao_thong\\data\\car.csv";

    public boolean append = true;
    public boolean noAppend = false;

    @Override
    public List<Car> findAll() {
        List<Car> listCar = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(CAR_FILE);
        String[] Array;
        for (int i = 0; i < stringList.size(); i++) {
            Array = stringList.get(i).split(",");
            Car car = new Car(Array[0], Array[1], Integer.parseInt(Array[2]), Array[3], Array[4], Integer.parseInt(Array[5]));
            listCar.add(car);
        }

        return listCar;
    }

    @Override
    public void add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfoToFileCar());
        ReadAndWriteFile.writeFileCSV(CAR_FILE, stringList, append);


    }

    @Override
    public boolean delete(String numberPlate) {
        List<Car> carList = findAll();
        boolean flag = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getNumberPlate().equals(numberPlate)) {
                carList.remove(i);
                flag = true;
                break;
            }
        }
        if (flag) {
            List<String> stringList = new ArrayList<>();
            for (Car car : carList) {
                stringList.add(car.getInfoToFileCar());
            }
            ReadAndWriteFile.writeFileCSV(CAR_FILE, stringList, noAppend);
        }
        return flag;

//    public Car findCarByNumberPlate(String numberPlate) {
//        List<Car> listCar = new ArrayList<>();
//        for (int i = 0; i < listCar.size(); i++) {
//            if (listCar.get(i).getNumberPlate().equals(numberPlate)) {
//                return listCar.get(i);
//            }
//        }
//        return null;
//    }

    }
}



package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository{
public static List<Truck> listTruck=new ArrayList<>();
static {
    listTruck.add( new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3));
    listTruck.add( new Truck("43C-47.678","Hino",2020,"nguyen van N",6));
    listTruck.add( new Truck("43C-45.235","Huyndai",2021,"Nguyễn Văn Tuong",9));
}

    @Override
    public List<Truck> findAll() {
        return listTruck ;
    }

    @Override
    public void add(Truck truck) {
        listTruck.add(truck);

    }
    @Override
    public void delete(String numberPlate) {
      Truck trucks= findTruckByNumberPlate(numberPlate);
        if(trucks!=null){
            listTruck.remove(trucks);
            System.out.println("bạn đã xóa thành công");
        }else {
            System.out.println("bạn không tìm thấy biển số xe");
        }



    }
    public Truck findTruckByNumberPlate(String numberPlate){
        for (int i = 0; i < listTruck.size(); i++) {
           if(listTruck.get(i).getNumberPlate().equals(numberPlate)) {
               return listTruck.get(i);
           }
        }
        return null;
    }
}

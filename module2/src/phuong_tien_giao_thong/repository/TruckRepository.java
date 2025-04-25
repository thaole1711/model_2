package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.entity.Truck;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckRepository implements ITruckRepository{
//public static List<Truck> listTruck=new ArrayList<>();
//static {
//    listTruck.add( new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3));
//    listTruck.add( new Truck("43C-47.678","Hino",2020,"nguyen van N",6));
//    listTruck.add( new Truck("43C-45.235","Huyndai",2021,"Nguyễn Văn Tuong",9));
//}
public final String TRUCK_FILE="D:\\codegym\\module2\\module2\\src\\phuong_tien_giao_thong\\data\\truck.cvs";
    @Override
    public List<Truck> findAll() {
        List<Truck>listTruck= new ArrayList<>();
        List<String> stringList= ReadAndWriteFile.readFileCSV(TRUCK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array=stringList.get(i).split(",");
            listTruck.add(new Truck(array[0],array[1],Integer.parseInt(array[2]) ,array[3],Integer.parseInt(array[4])));
        }

        return listTruck ;
    }

    @Override
    public void add(Truck truck) {
//        List<String> truckList= new ArrayList<>();
//        truckList.add(truck.getInfoToFileTruck());
//        ReadAndWriteFile.writeFileCSV(TRUCK_FILE,truckList,true);
        ReadAndWriteFile.writeFileCSV(TRUCK_FILE, Arrays.asList(truck.getInfoToFileTruck()),true);
    }
    @Override
    public boolean delete(String numberPlate) {
     List<Truck> truckList=findAll();
     boolean flag=false;
        for (int i = 0; i < truckList.size(); i++) {
            if(truckList.get(i).getNumberPlate().equals(numberPlate)){
                truckList.remove(i);
                flag=true;
                break;
            }
        }
        if(flag){
            List<String> stringList= new ArrayList<>();
            for (int i = 0; i < truckList.size(); i++) {
                stringList.add(truckList.get(i).getInfoToFileTruck());
            }
            ReadAndWriteFile.writeFileCSV(TRUCK_FILE,stringList,false);
        }
        return flag;
    }
}

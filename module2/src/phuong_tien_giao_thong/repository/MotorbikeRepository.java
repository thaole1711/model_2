package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {
    private static List<Motorbike> listMotorbike = new ArrayList<>() ;
    static {
        listMotorbike.add(new Motorbike("43-K1-678.56","huynhdai",2020,"Nguyen Van A",100));
        listMotorbike.add(new Motorbike("43-HI-345.89","toyota",2019,"Nguyen Van B",103));
        listMotorbike.add(new Motorbike("43-AK-765.23","honda",2018,"Nguyen Van C",110));
    }
    @Override
    public List<Motorbike> findAll() {
        return listMotorbike;
    }

    @Override
    public void add(Motorbike motorbike) {
         listMotorbike.add(motorbike);
    }

    @Override
    public void delete(String numberPlate) {
        Motorbike motorbikeNumberPlate= findMotorbikeByNumberplate(numberPlate);
        if(motorbikeNumberPlate!=null){
            listMotorbike.remove(motorbikeNumberPlate);
            System.out.println("bạn đã xóa thành công");

        }else {
            System.out.println("bạn không tim thấy biển số xe");
        }
    }
    public Motorbike findMotorbikeByNumberplate(String numberplate){
        for (int i = 0; i < listMotorbike.size(); i++) {
            if(listMotorbike.get(i).getNumberPlate().equals(numberplate)){
                return listMotorbike.get(i);
            }
        }
        return null;

    }
}


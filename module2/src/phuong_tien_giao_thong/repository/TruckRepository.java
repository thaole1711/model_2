package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Car;
import phuong_tien_giao_thong.entity.Truck;

public class TruckRepository implements ITruckRepository{
public static Truck[] trucks=new Truck[5];
static {
    trucks[0]= new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3);
    trucks[1]= new Truck("43C-47.678","Hino",2020,"nguyen van N",6);
    trucks[2]= new Truck("43C-45.235","Huyndai",2021,"Nguyễn Văn Tuong",9);
}

    @Override
    public Truck[] findAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        for (int i = 0; i < trucks.length; i++) {
            if(trucks[i]==null){
                trucks[i]=truck;
                break;


            }
        }

    }

    @Override
    public void display(Truck truck) {

    }

    @Override
    public void delete(Truck truck) {

    }
}

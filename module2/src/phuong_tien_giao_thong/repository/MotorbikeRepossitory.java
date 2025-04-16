package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Motorbike;
import phuong_tien_giao_thong.entity.Truck;

public class MotorbikeRepossitory implements IMotorbikeRepository {
   private static Motorbike[] motorbikes = new Motorbike[10];
    static {
        motorbikes[0]=new Motorbike("43-K1-678.56","huynhdai",2020,"Nguyen Van A",100);
        motorbikes[1]=new Motorbike("43-HI-345.89","toyota",2019,"Nguyen Van B",103);
        motorbikes[2]=new Motorbike("43-AK-765.23","honda",2018,"Nguyen Van C",110);
    }

    @Override
    public void add(Motorbike motorbike) {
        for (int i = 0; i < motorbikes.length; i++) {
            if(motorbikes[i]==null){
                motorbikes[i] = motorbike;
                break;

            }
        }
    }

    @Override
    public Motorbike[] findAll() {
        return motorbikes;
    }

    @Override
    public void delete(Motorbike motorbike) {

    }

    @Override
    public void display(Motorbike motorbike) {

    }
}


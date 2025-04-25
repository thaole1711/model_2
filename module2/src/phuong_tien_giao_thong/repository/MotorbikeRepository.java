package phuong_tien_giao_thong.repository;

import phuong_tien_giao_thong.entity.Motorbike;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {
    //    private static List<Motorbike> listMotorbike = new ArrayList<>() ;
//    static {
//        listMotorbike.add(new Motorbike("43-K1-678.56","huynhdai",2020,"Nguyen Van A",100));
//        listMotorbike.add(new Motorbike("43-HI-345.89","toyota",2019,"Nguyen Van B",103));
//        listMotorbike.add(new Motorbike("43-AK-765.23","honda",2018,"Nguyen Van C",110));
//    }
    public final String MOTOBIKE_FILE = "D:\\codegym\\module2\\module2\\src\\phuong_tien_giao_thong\\data\\motorbike.csv";

    @Override
    public List<Motorbike> findAll() {
        List<Motorbike> listMotorbike = new ArrayList<>();
        String[] array;
        List<String> motorbikeList = ReadAndWriteFile.readFileCSV(MOTOBIKE_FILE);
        for (int i = 0; i < motorbikeList.size(); i++) {
            array = motorbikeList.get(i).split(",");
            listMotorbike.add(new Motorbike(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4])));

        }
        return listMotorbike;
    }

    @Override
    public void add(Motorbike motorbike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motorbike.getInfoToFileMotobike());
        ReadAndWriteFile.writeFileCSV(MOTOBIKE_FILE, stringList, true);
    }

    @Override
    public boolean delete(String numberPlate) {
        boolean found = false;
        List<Motorbike> motorbikes = findAll();
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getNumberPlate().equals(numberPlate)) {
                motorbikes.remove(i);
                found = true;
                break;
            }
        }
        if(found){
            List<String> stringList= new ArrayList<>();
            for (Motorbike motorbike : motorbikes){
                stringList.add(motorbike.getInfoToFileMotobike());
            }
            ReadAndWriteFile.writeFileCSV(MOTOBIKE_FILE,stringList,false);
        }
        return found;

    }

}


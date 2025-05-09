package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import ghi_file_quan_li_san_pham.common.ReadAndWriteFile;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private String stringPath = "D:\\codegym\\module2\\module2\\src\\case_study\\data\\facility.CSV";


    @Override
    public List<Facility> findAll() {
        throw new UnsupportedOperationException("chưa hỗ trợ");
    }

    @Override
    public void update(Facility facility) {

    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Map<Facility, Integer> getAll() {
        List<String> stringList = ReadAndWriteFile.ReadFileCVS(stringPath);
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        String[] arr;
        int count = 0;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            if (arr[0].startsWith("SVVL")) {
                Facility facility = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                count = Integer.parseInt(arr[arr.length - 1]);
                facilityIntegerMap.put(facility, count);
            } else if (arr[0].startsWith("SVHO")) {
                Facility facility = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
                count = Integer.parseInt(arr[arr.length - 1]);
                facilityIntegerMap.put(facility, count);
            } else if (arr[0].startsWith("SVRO")) {
                Facility facility = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
                count = Integer.parseInt(arr[arr.length - 1]);
                facilityIntegerMap.put(facility, count);
            }
        }
        return facilityIntegerMap;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList= new ArrayList<>();
        if(facility instanceof Villa){
            Villa villa = (Villa) facility;
            stringList.add(villa.getInfoVilla(0));
        } else if (facility instanceof Room) {
            Room room = (Room) facility;
            stringList.add(room.getInfoRoom(0));
        } else  {
            House house= (House) facility;
            stringList.add(house.getInfoHouse(0));
        }

       ReadAndWriteFile.WriteFileCVS(stringPath,stringList,true);

    }

    @Override
    public void displayMaintenance() {

    }
}

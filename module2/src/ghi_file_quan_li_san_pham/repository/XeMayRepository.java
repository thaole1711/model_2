package ghi_file_quan_li_san_pham.repository;

import ghi_file_quan_li_san_pham.common.ReadAndWriteFile;
import ghi_file_quan_li_san_pham.entity.Oto;
import ghi_file_quan_li_san_pham.entity.XeMay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XeMayRepository implements IXeMayRepository {
    private static String stringPath = "D:\\codegym\\module2\\module2\\src\\ghi_file_quan_li_san_pham\\data\\xemay.csv";

    @Override
    public List<XeMay> findAll() {
        List<String> stringList = ReadAndWriteFile.ReadFileCVS(stringPath);
        List<XeMay> xeMayList = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            xeMayList.add(new XeMay(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), Double.parseDouble(arr[4])));
        }
        return xeMayList;

    }

    @Override
    public void add(XeMay xeMay) {
        ReadAndWriteFile.WriteFileCVS(stringPath, Arrays.asList(xeMay.getInfo()), true);

    }

    @Override
    public void delete(String id) {
        List<XeMay> xeMayList = findAll();
        for (int i = 0; i < xeMayList.size(); i++) {
            if(xeMayList.get(i).getBienKiemSoat().equals(id)){
                xeMayList.remove(i);
                break;
            }
        }
        List<String> list= new ArrayList<>();
        for (XeMay xeMay:xeMayList){
            list.add(xeMay.getInfo());
        }
        ReadAndWriteFile.WriteFileCVS(stringPath,list,false);


    }

    @Override
    public void update(XeMay xeMay) {
        List<XeMay> xeMayList = findAll();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(xeMay.getBienKiemSoat())) {
                xeMayList.set(i, xeMay);

            }
        }
        List<String> stringList = new ArrayList<>();
        for (XeMay xeMay1 : xeMayList) {
            stringList.add(xeMay1.getInfo());
        }
        ReadAndWriteFile.WriteFileCVS(stringPath, stringList, false);
    }

    @Override
    public boolean findId(String id) {
        List<XeMay> xeMayList = findAll();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void seach(String id) {
        List<XeMay> xeMayList= findAll();
        for (int i = 0; i < xeMayList.size(); i++) {

        }
    }
}

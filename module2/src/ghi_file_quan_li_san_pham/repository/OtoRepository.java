package ghi_file_quan_li_san_pham.repository;

import ghi_file_quan_li_san_pham.common.ReadAndWriteFile;
import ghi_file_quan_li_san_pham.entity.Oto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private final String FILE_CAR="D:\\codegym\\module2\\module2\\src\\ghi_file_quan_li_san_pham\\data\\oto.csv";
    @Override
    public List<Oto> findAll() {
        List<Oto> otoList= new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.ReadFileCVS(FILE_CAR);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array= stringList.get(i).split(",");
            otoList.add(new Oto(array[0],array[1],array[2],Integer.parseInt(array[3]),array[4],Integer.parseInt(array[5])));
        }
        return otoList;

    }

    @Override
    public void add( Oto oto) {
       ReadAndWriteFile.WriteFileCVS(FILE_CAR, Arrays.asList(oto.getInFoToFileOto()),false);
    }

    @Override
    public void delete(int id) {
        List<Oto> otoList= findAll();
        for (int i = 0; i < otoList.size(); i++) {
            if( otoList.get(i).getBienKiemSoat().equals(id)){
                otoList.remove(i);
                break;
            }
        }

            List<String> stringList=new ArrayList<>();
            for (int i = 0; i < otoList.size(); i++) {
                stringList.add(otoList.get(i).getInFoToFileOto());
            }
            ReadAndWriteFile.WriteFileCVS(FILE_CAR,stringList,false);



    }
    public boolean findId(String bienSo){
        List<Oto> otoList= findAll();
        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat().contains(bienSo)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public void update(Oto oto) {
        List<String> stringList= new ArrayList<>();
       List<Oto> otoList= findAll();
        for (int i = 0; i < otoList.size(); i++) {
          if( otoList.get(i).getBienKiemSoat().equals(oto.getBienKiemSoat())) {
              otoList.set(i,oto);
          }
        }
        for (int i = 0; i < otoList.size(); i++) {
            stringList.add(otoList.get(i).getInFoToFileOto());

        }
        ReadAndWriteFile.WriteFileCVS(FILE_CAR,stringList,true);

    }

    @Override
    public void seach() {

    }
}

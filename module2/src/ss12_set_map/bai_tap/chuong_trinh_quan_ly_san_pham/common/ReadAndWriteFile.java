package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.common;


import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // phương thức ghi
    public static void writeFileCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lôi đọc file");
        }
    }

    // phương thưc đọc
    public static List<String> readFileCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("lôi đọc file");
        }
        return stringList;
    }

    public static <T> void writeListObjectToDat(String filePath, List<T> ObjectList) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ObjectList);

        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lỗi ghi file");

        }finally {
          try {
              objectOutputStream.close();
              fileOutputStream.close();
          }catch (IOException e){
              System.out.println("lỗi đóng fle");
          }
        }
    }
    public static <T> List<T> readListObjectFromDat(String filePath){
        List<T> objectList= new ArrayList<>();
        File file =new File(filePath);
        FileInputStream fileInputStream= null;
        ObjectInputStream objectInputStream=null;
        try{
            if (file.length() > 0) {
                fileInputStream =new FileInputStream(file);
                objectInputStream= new ObjectInputStream(fileInputStream);
               objectList= (List<T>) objectInputStream.readObject();
            }
        }catch (FileNotFoundException e){
            System.out.println(" lỗi không tìm thấy file");
        }catch (IOException e){
            System.out.println("loi đọc ghi file");
        } catch (ClassNotFoundException e) {
            System.out.println("lỗi không tìm thấy class");
        }
        return objectList;
    }
}


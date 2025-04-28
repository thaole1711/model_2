package ghi_file_quan_li_san_pham.common;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void WriteFileCVS(String pathFile, List<String> stringList, boolean append)  {
        File file = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("loi ghi file");
            e.printStackTrace();
        }
    }
    public static List<String> ReadFileCVS(String pathFlie) {
        List<String> stringList= new ArrayList<>();
        File file = new File(pathFlie);
        try(FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader =new BufferedReader(fileReader)) {
            String line="";
            while ((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }

        } catch (IOException e) {
            System.out.println("loi doc file");
        }
        return stringList;
    }
}


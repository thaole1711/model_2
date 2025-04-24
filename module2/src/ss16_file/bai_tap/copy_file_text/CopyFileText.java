package ss16_file.bai_tap.copy_file_text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đường dẫn tệp tin nguồn:");
        String source = scanner.nextLine();
       Path sourceFile= Paths.get(source);
        if (!Files.exists(sourceFile)) {
            System.out.println("tệp nguồn không tồn tại");

        }
        System.out.println("nhập đường dẫn tệp tin đích:");
        String target = scanner.nextLine();
       Path targetFile=Paths.get(target);
        if(Files.exists(targetFile)){
            System.out.println("tệp đích có tồn tại");
        }

        try{
            Files.copy(sourceFile,targetFile);
            System.out.println("thành công");
        } catch (FileNotFoundException e) {
            System.out.println("lỗi file");
        } catch (IOException e) {
            System.out.println("có lỗi khi sao chép");
        }


    }
}

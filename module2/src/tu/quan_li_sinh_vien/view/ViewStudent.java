package tu.quan_li_sinh_vien.view;

import tu.quan_li_sinh_vien.entity.Student;

import java.util.Scanner;

public class ViewStudent {

    private static Scanner scanner = new Scanner(System.in);

    public Student add() {
        System.out.println("nhập mã sih viên");
        String idSinhVien = scanner.nextLine();
        System.out.println("nhập tên sih viên");
        String nameSinhVien = scanner.nextLine();
        System.out.println("nhập năm sinh");
        int yearOfBrithSinhVien = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập điểm trung bình");
        double averageSinhVien = Integer.parseInt(scanner.nextLine());
        Student student = new Student(idSinhVien, nameSinhVien, yearOfBrithSinhVien, averageSinhVien);
        return student;
    }
    public String idContain(){
        System.out.println("nhập id bạn muốn kiem tra");
        String id= scanner.nextLine();
        return id;

    }

    public String idDelete() {
        System.out.println("nhập id bạn muốn xóa");
        String iDelete=scanner.nextLine();
        return iDelete;
    }
    public String nameSeach(){
        System.out.println("nhập tên bạn muốn tìm");
        String name=scanner.nextLine();
        return name;
    }
}

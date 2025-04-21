package tu.quan_li_sinh_vien.controller;

import tu.quan_li_sinh_vien.entity.Student;
import tu.quan_li_sinh_vien.service.StudentSevice;
import tu.quan_li_sinh_vien.view.ViewStudent;

import java.util.Scanner;

public class ManagementController {
   private static Scanner scanner = new Scanner(System.in);

public static void displayMenu(){
    ViewStudent viewStudent=new ViewStudent();
    StudentSevice studentSevice = new StudentSevice();
    int number =0;
    do{
        System.out.println("MENU");
        System.out.println("vui lòng chọn chức năng:" +
                "\n 1. thêm mới sinh viên" +
                "\n 2.in danh sách sinh viên ra màn hình" +
                "\n3. kiểm tra danh sách có rỗng hay không" +
                "\n 4. lấy ra sô lượng sinh viên trong danh sách" +
                "\n 5. làm  rỗng danh sách sinh viên" +
                "\n 6. kiểm tra sinh viên co ton tại hay không" +
                "\n 7. xóa một sinh viên ra khỏi danh sach" +
                "\n 8. tìm kiếm sinh viên bằng tên" +
                "\n 9. xuất ra danh sách sinh viên có điêm từ cao đến thấp" +
                "\n 10. thoát khỏi chương trình" +
                "\n sô bạn chọn là:");
        number = scanner.nextInt();
        switch (number) {
            case 1:
              Student student= viewStudent.add();
              studentSevice.addStudent(student);
                System.out.println(student);
                break;
            case 2:
                studentSevice.display();
                break;
            case 3:
                System.out.println( studentSevice.checkEmpty());
                break;
            case 4:
                System.out.println("sô lượng sinh viên là:"+studentSevice.quantity());
                break;
            case 5:
                studentSevice.empty();
                break;
            case 6:
                String student1= viewStudent.idContain();
                System.out.println( studentSevice.contain(student1));
                break;
            case 7:
                String student2= viewStudent.idDelete();
                studentSevice.delete(student2);
                break;
            case 8:
                String student3= viewStudent.nameSeach();
                System.out.println(studentSevice.tenSeach(student3));
                break;
            case 9:
                System.out.println(studentSevice.sortStudent()+"\n");
                break;
            case 10:
                System.out.println("thoát chương trình");
                System.exit(0);
                break;
        }
    }while(number!=10);
}

}





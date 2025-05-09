package case_study.controller;

import case_study.common.ExceptionManagement;
import case_study.model.Employee;
import case_study.service.EmployeeService;
import case_study.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);

    public static void employeeManagement() {
        EmployeeService employeeService = new EmployeeService();
        boolean flag = true;

        do {
            int number = 0;
            System.out.println("Employee Management ");
            System.out.println(
                    "\n 1.Display list employess" +
                            "\n 2. Add new employee" +
                            "\n 3. Edit employee" +
                            "\n 4. delete employee" +
                            "\n5. Return main menu");
            number = ExceptionManagement.exception(scanner, " chức năng bạn chon là:");
            switch (number) {
                case 1:
                    List<Employee> employees = employeeService.findAll();
                    EmployeeView.display(employees);
                    break;
                case 2:
                    Employee employee = EmployeeView.add();
                    employeeService.add(employee);
                    break;
                case 3:
                    String id = EmployeeView.findId();
                    boolean found = employeeService.findId(id);
                    if (found) {
                        Employee employee1 = EmployeeView.update(id);
                        employeeService.update(employee1);
                    } else {
                        System.out.println("không tìm thấy id");
                    }

                    break;
                case 4:
                    String idEmployee = EmployeeView.findId();
                    boolean foundId = employeeService.findId(idEmployee);
                    if (foundId) {
                        employeeService.delete(idEmployee);
                        System.out.println("da xoa ");
                    } else {
                        System.out.println("khong tim thay id");
                    }
                    break;
                case 5:
                    System.out.println("thoát chương trình");
                    flag = false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        } while (flag);
    }
}

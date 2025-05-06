package case_study.repository;

import case_study.common.ReadAndWriteFileCSV;
import case_study.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    public final String stringPath = "D:\\codegym\\module2\\module2\\src\\case_study\\data\\employeeRepository.CSV";

    @Override
    public List<Employee> findAll() {
        List<String> stringList = ReadAndWriteFileCSV.ReadFileCSV(stringPath);
        List<Employee> employees = new ArrayList<>();
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            employees.add(new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6],array[7], array[8], Double.parseDouble(array[9])));
        }
        return employees;
    }
    @Override
    public void update(Employee employee) {
        List<Employee> employees = findAll();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getMaNhanVien().equals(employee.getMaNhanVien())) {
                employees.set(i, employee);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee employee1 : employees) {
            stringList.add(employee1.getInfor());
        }
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, stringList, false);
    }

    @Override
    public void add(Employee employee) {
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, Arrays.asList(employee.getInfor()), true);

    }

    @Override
    public boolean findId( String id) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien().equals(id) ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete( String id) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien().equals(id) ) {
                employeeList.remove(i);
                break;
            }
        }
        List<String> stringList= new ArrayList<>();
        for (Employee employee: employeeList){
            stringList.add(employee.getInfor());
        }
        ReadAndWriteFileCSV.WriteFileCSV(stringPath,stringList,false);




    }
}

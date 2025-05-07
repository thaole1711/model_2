package case_study.repository;

import case_study.common.ReadAndWriteFileCSV;
import case_study.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    private static String stringPath = "D:\\codegym\\module2\\module2\\src\\case_study\\data\\customer.CSV";

    private static Scanner scanner = new Scanner(System.in);


    @Override
    public List<Customer> findAll() {
        List<String> stringList = ReadAndWriteFileCSV.ReadFileCSV(stringPath);
        List<Customer> customerList = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }

        return customerList;
    }

    @Override
    public void update(Customer customer) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(customer.getIdCustomer())) {
                customerList.set(i, customer);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer1 : customerList) {
            stringList.add(customer1.getInForCustomer());
        }
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, stringList, false);

    }

    @Override
    public void add(Customer customer) {
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, Arrays.asList(customer.getInForCustomer()), true);

    }

    @Override
    public boolean findId(String id) {
        List<Customer> customerList = findAll();
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(String id) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(id)) {
                customerList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInForCustomer());
        }
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, stringList, false);


    }
}

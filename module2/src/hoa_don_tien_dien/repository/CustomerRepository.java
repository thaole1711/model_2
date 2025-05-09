package hoa_don_tien_dien.repository;

import hoa_don_tien_dien.common.ReadAndWriteFileCSV;
import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.model.ForeignCustomer;
import hoa_don_tien_dien.model.VietNamCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private final String stringPath = "D:\\codegym\\module2\\module2\\src\\hoa_don_tien_dien\\data\\customer.CSV";

    @Override
    public List<Customer> findAll() {
        List<String> stringList = ReadAndWriteFileCSV.ReadFileCSV(stringPath);
        List<Customer> customerList = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            if (arr[0].startsWith("KHVN")) {
                Customer customer = new VietNamCustomer(arr[0], arr[1], arr[2], arr[3]);
                customerList.add(customer);
            }else if(arr[0].startsWith("KHNN")){
                Customer customer=new ForeignCustomer(arr[0],arr[1], arr[2]);
                customerList.add(customer);
            }
        }
        return customerList;

    }


    @Override
    public void add(Customer customer) {
        List<String> stringList= new ArrayList<>();
        if(customer instanceof VietNamCustomer){
            VietNamCustomer vietNamCustomer=(VietNamCustomer) customer;
            stringList.add(vietNamCustomer.getInfo());
        } else if (customer instanceof ForeignCustomer) {
            ForeignCustomer foreignCustomer=(ForeignCustomer) customer;
            stringList.add(foreignCustomer.getInfo());
        }
        ReadAndWriteFileCSV.WriteFileCSV(stringPath,stringList,true);
    }
    @Override
    public boolean Seach(String name) {
        List<String> customerList= ReadAndWriteFileCSV.ReadFileCSV(stringPath);
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).contains(name)){
                return true;
            }
        }
        return false;

    }
}

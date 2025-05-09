package hoa_don_tien_dien.service;

import hoa_don_tien_dien.model.Customer;

import java.util.List;

public interface ICustomerSevice {
    List<Customer> findAll();
    void add(Customer customer);
    void Seach();

}

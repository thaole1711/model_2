package hoa_don_tien_dien.repository;

import hoa_don_tien_dien.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void add(Customer customer);
    boolean Seach(String name);
}

package hoa_don_tien_dien.service;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.repository.CustomerRepository;
import hoa_don_tien_dien.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerSevice {
    ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void Seach() {

    }
}

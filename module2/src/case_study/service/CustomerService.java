package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void update(Customer customer) {
        iCustomerRepository.update(customer);
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }


    @Override
    public boolean findId(String id) {
        return iCustomerRepository.findId(id);
    }

    @Override
    public void delete(String id) {
        iCustomerRepository.delete(id);
    }
}

package com.example.service.customer;

import com.example.entity.customer.Customer;
import com.example.repository.customer.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {


        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null){
            throw new RuntimeException("Given id is not found");
        }
        return customer;
    }

    public Customer createCustomer(Customer customer) throws Exception {
       customer.setId(0l);
       return customerRepository.save(customer);
    }
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            throw new RuntimeException("This Id is not found");
        }
        customerRepository.delete(customer);
        return customer;
    }
}


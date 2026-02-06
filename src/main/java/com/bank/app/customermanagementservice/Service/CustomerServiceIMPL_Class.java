package com.bank.app.customermanagementservice.Service;

import com.bank.app.customermanagementservice.Entity.Customer;
import com.bank.app.customermanagementservice.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceIMPL_Class implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceIMPL_Class(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

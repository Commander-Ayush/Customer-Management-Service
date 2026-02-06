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

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer, Long customerID) {
        Customer existingCustomerObject = customerRepository.findById(customerID).get();
        if(existingCustomerObject.getFirstName() != customer.getFirstName()) {
            existingCustomerObject.setFirstName(customer.getFirstName());
        }
        if(existingCustomerObject.getLastName() != customer.getLastName()) {
            existingCustomerObject.setLastName(customer.getLastName());
        }
        if(existingCustomerObject.getEmail() != customer.getEmail()) {
            existingCustomerObject.setEmail(customer.getEmail());
        }
        if(existingCustomerObject.getPhoneNumber() != customer.getPhoneNumber()) {
            existingCustomerObject.setPhoneNumber(customer.getPhoneNumber());
        }
        customerRepository.save(existingCustomerObject);
    }

    @Override
    public void deleteCustomer(Long customerID) {
        customerRepository.deleteById(customerID);
    }


}

package com.bank.app.customermanagementservice.Service;

import com.bank.app.customermanagementservice.Entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();


    void createCustomer(Customer customer);

    void updateCustomer(Customer customer, Long customerID);

    void  deleteCustomer(Long customerID);
}

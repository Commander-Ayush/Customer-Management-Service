package com.bank.app.customermanagementservice.Controller;

import com.bank.app.customermanagementservice.Entity.Customer;
import com.bank.app.customermanagementservice.Repository.CustomerRepository;
import com.bank.app.customermanagementservice.Service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/admin/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customerList = customerService.getAllCustomers();
        return ResponseEntity.ok().body(customerList);
    }

    @PostMapping("/public/customer/new/")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return ResponseEntity.ok().body("Customer Created Successfully");
    }

    @PutMapping("public/customer/update/{customerID}")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer, @PathVariable("customerID") Long customerID) {
        customerService.updateCustomer(customer, customerID);
        return ResponseEntity.ok().body("Customer Updated Successfully");
    }

    @DeleteMapping("public/customer/delete/{customerID}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("customerID")  Long customerID ) {
        customerService.deleteCustomer(customerID);
        return ResponseEntity.ok().body("Customer Deleted Successfully");
    }




}

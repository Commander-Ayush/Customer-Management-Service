package com.bank.app.customermanagementservice.Repository;

import com.bank.app.customermanagementservice.Entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

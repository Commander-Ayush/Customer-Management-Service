package com.bank.app.customermanagementservice.Repository;

import com.bank.app.customermanagementservice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

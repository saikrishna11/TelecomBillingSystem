package com.telecom.billing.customerservice.repository;

import com.telecom.billing.customerservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}

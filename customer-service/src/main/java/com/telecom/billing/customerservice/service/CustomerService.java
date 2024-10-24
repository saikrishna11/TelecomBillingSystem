package com.telecom.billing.customerservice.service;

import com.telecom.billing.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(String id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(String id, Customer customerDetails);

    void deleteCustomer(String id);
}

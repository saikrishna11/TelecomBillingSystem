package com.telecom.billing.customerservice.controller;

import com.telecom.billing.customerservice.model.Customer;
import com.telecom.billing.customerservice.service.CustomerService;
import com.telecom.common.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.telecom.common.utils.Constants.CROSS_ORIGIN_URL;


@CrossOrigin(origins = CROSS_ORIGIN_URL)

@RestController
@RequestMapping("/customers")
@Api(tags = "Customer Management")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    @ApiOperation(value = "Get all customers")
    public ApiResponse<List<Customer>> getAllCustomers() {
        return new ApiResponse<>(true, "Customers retrieved successfully", customerService.getAllCustomers());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get a customer by ID")
    public ApiResponse<Customer> getCustomerById(@PathVariable String id) {
        return new ApiResponse<>(true, "Customer retrieved successfully", customerService.getCustomerById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new customer")
    public ApiResponse<Customer> createCustomer(@RequestBody Customer customer) {
        return new ApiResponse<>(true, "Customer created successfully", customerService.createCustomer(customer));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a customer by ID")
    public ApiResponse<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customerDetails) {
        return new ApiResponse<>(true, "Customer created successfully", customerService.updateCustomer(id, customerDetails));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a customer by ID")
    public ApiResponse<String> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
        return new ApiResponse<>(true, "Customer deleted successfully", null);
    }
}

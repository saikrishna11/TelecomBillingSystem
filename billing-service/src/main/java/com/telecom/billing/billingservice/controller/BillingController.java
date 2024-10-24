package com.telecom.billing.billingservice.controller;

import com.telecom.billing.billingservice.model.Billing;
import com.telecom.billing.billingservice.service.BillingService;
import com.telecom.common.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
@Api(tags = "Billing Management")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping
    @ApiOperation(value = "Get all bills")
    public ApiResponse<List<Billing>> getAllBillings() {
        return new ApiResponse<>(true, "Bills retrieved successfully", billingService.getAllBillings());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get a bill by ID")
    public ApiResponse<Billing> getBillingById(@PathVariable String id) {
        return new ApiResponse<>(true, "Bill retrieved successfully", billingService.getBillingById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new bill")
    public ApiResponse<Billing> createBilling(@RequestBody Billing billing) {
        return new ApiResponse<>(true, "Bill created successfully", billingService.createBilling(billing));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a bill by ID")
    public ApiResponse<Billing> updateBilling(@PathVariable String id, @RequestBody Billing billingDetails) {
        return new ApiResponse<>(true, "Bill updated successfully", billingService.updateBilling(id, billingDetails));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a bill by ID")
    public ApiResponse<String> deleteBilling(@PathVariable String id) {
        billingService.deleteBilling(id);
        return new ApiResponse<>(true, "Bill deleted successfully", null);
    }

}

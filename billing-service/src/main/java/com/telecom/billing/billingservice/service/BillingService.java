package com.telecom.billing.billingservice.service;

import com.telecom.billing.billingservice.model.Billing;

import java.util.List;

public interface BillingService {
    List<Billing> getAllBillings();

    Billing getBillingById(String id);

    Billing createBilling(Billing billing);

    Billing updateBilling(String id, Billing billingDetails);

    void deleteBilling(String id);
}

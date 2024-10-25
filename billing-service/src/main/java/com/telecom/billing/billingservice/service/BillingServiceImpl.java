package com.telecom.billing.billingservice.service;

import com.telecom.billing.billingservice.model.Billing;
import com.telecom.billing.billingservice.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService {
    @Autowired
    private BillingRepository billingRepository;

    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }

    public Billing getBillingById(String id) {
        return billingRepository.findById(id).orElse(null);
    }

    public Billing createBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    public Billing updateBilling(String id, Billing billingDetails) {
        Billing billing = billingRepository.findById(id).orElse(null);
        if (billing != null) {
            billing.setCustomerId(billingDetails.getCustomerId());
            billing.setPlanId(billingDetails.getPlanId());
            billing.setAmount(billingDetails.getAmount());
            return billingRepository.save(billing);
        }
        return null;
    }

    public void deleteBilling(String id) {
        billingRepository.deleteById(id);
    }
}

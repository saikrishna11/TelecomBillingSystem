package com.telecom.billing.billingservice.repository;

import com.telecom.billing.billingservice.model.Billing;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillingRepository extends MongoRepository<Billing, String> {
}

package com.telecom.billing.billingservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "billings")
public class Billing {

    @Id
    private String id;
    private String customerId;
    private String planId;
    private double amount;

}

package com.telecom.billing.planservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "plans")
public class Plan {
    @Id
    private String id;
    private String name;
    private double price;

}

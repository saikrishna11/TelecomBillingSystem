package com.telecom.billing.planservice.repository;

import com.telecom.billing.planservice.model.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanRepository extends MongoRepository<Plan, String> {
}

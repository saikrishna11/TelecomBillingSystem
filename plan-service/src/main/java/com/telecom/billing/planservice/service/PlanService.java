package com.telecom.billing.planservice.service;

import com.telecom.billing.planservice.model.Plan;

import java.util.List;

public interface PlanService {
    List<Plan> getAllPlans();

    Plan getPlanById(String id);

    Plan createPlan(Plan plan);

    Plan updatePlan(String id, Plan planDetails);

    void deletePlan(String id);
}

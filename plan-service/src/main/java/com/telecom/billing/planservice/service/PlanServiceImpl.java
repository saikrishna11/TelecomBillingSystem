package com.telecom.billing.planservice.service;

import com.telecom.billing.planservice.model.Plan;
import com.telecom.billing.planservice.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    public Plan getPlanById(String id) {
        return planRepository.findById(id).orElse(null);
    }

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public Plan updatePlan(String id, Plan planDetails) {
        Plan plan = planRepository.findById(id).orElse(null);
        if (plan != null) {
            plan.setName(planDetails.getName());
            plan.setPrice(planDetails.getPrice());
            return planRepository.save(plan);
        }
        return null;
    }

    public void deletePlan(String id) {
        planRepository.deleteById(id);
    }
}

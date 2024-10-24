package com.telecom.billing.planservice.controller;

import com.telecom.billing.planservice.model.Plan;
import com.telecom.billing.planservice.service.PlanService;
import com.telecom.common.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans")
@Api(tags = "Plan Management")
public class PlanController {
    @Autowired
    private PlanService planService;

    @GetMapping
    @ApiOperation(value = "Get all plans")
    public ApiResponse<List<Plan>> getAllPlans() {
        return new ApiResponse<>(true, "Plans retrieved successfully", planService.getAllPlans());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get a plan by ID")
    public ApiResponse<Plan> getPlanById(@PathVariable String id) {
        return new ApiResponse<>(true, "Plan retrieved successfully", planService.getPlanById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new plan")
    public ApiResponse<Plan> createPlan(@RequestBody Plan plan) {
        return new ApiResponse<>(true, "Plan created successfully", planService.createPlan(plan));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a plan by ID")
    public ApiResponse<Plan> updatePlan(@PathVariable String id, @RequestBody Plan planDetails) {
        return new ApiResponse<>(true, "Plan updated successfully", planService.updatePlan(id, planDetails));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a plan by ID")
    public ApiResponse<String> deletePlan(@PathVariable String id) {
        planService.deletePlan(id);
        return new ApiResponse<>(true, "Plan deleted successfully", null);
    }
}

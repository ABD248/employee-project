package com.employee_management_api.dto;

public record EmployeeResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        String department,
        double salary
) {}
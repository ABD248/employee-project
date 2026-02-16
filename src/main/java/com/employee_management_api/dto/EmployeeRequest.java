package com.employee_management_api.dto;

public record EmployeeRequest(
        String firstName,
        String lastName,
        String email,
        String department,
        double salary
) {}
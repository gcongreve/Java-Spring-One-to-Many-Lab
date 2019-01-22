package com.codeclan.labemployeetracking.EmployeeTracking.repositories;

import com.codeclan.labemployeetracking.EmployeeTracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.codeclan.labemployeetracking.EmployeeTracking.repositories;

import com.codeclan.labemployeetracking.EmployeeTracking.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

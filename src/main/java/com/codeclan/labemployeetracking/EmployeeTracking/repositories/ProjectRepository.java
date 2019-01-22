package com.codeclan.labemployeetracking.EmployeeTracking.repositories;

import com.codeclan.labemployeetracking.EmployeeTracking.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

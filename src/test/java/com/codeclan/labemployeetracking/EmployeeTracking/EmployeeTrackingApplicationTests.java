package com.codeclan.labemployeetracking.EmployeeTracking;

import com.codeclan.labemployeetracking.EmployeeTracking.models.Department;
import com.codeclan.labemployeetracking.EmployeeTracking.models.Employee;
import com.codeclan.labemployeetracking.EmployeeTracking.repositories.DepartmentRepository;
import com.codeclan.labemployeetracking.EmployeeTracking.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void makeNewDepartment(){
		Department department = new Department("Department of Redundency Department");
		Employee employee = new Employee("Graeme", "Congreve", 3, department);
		Employee betterEmployee = new Employee("Paul", "Wishart", 4, department);
		departmentRepository.save(department);
		employeeRepository.save(employee);
		employeeRepository.save(betterEmployee);
	}

//	@Test
//	public void makeNewEmployee() {
//		Department department = new Department("Department of Redundency Department");
//		Employee graeme = new Employee("Graeme", "Congreve", 3, department);
//
//	}

}


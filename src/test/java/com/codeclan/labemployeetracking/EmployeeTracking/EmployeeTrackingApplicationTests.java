package com.codeclan.labemployeetracking.EmployeeTracking;

import com.codeclan.labemployeetracking.EmployeeTracking.models.Department;
import com.codeclan.labemployeetracking.EmployeeTracking.models.Employee;
import com.codeclan.labemployeetracking.EmployeeTracking.models.Project;
import com.codeclan.labemployeetracking.EmployeeTracking.repositories.DepartmentRepository;
import com.codeclan.labemployeetracking.EmployeeTracking.repositories.EmployeeRepository;
import com.codeclan.labemployeetracking.EmployeeTracking.repositories.ProjectRepository;
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

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void makeNewDepartment(){
//		Department department = new Department("Department of Redundency Department");
//		Employee employee = new Employee("Graeme", "Congreve", 3, department);
//		Employee betterEmployee = new Employee("Paul", "Wishart", 4, department);
//		departmentRepository.save(department);
//		employeeRepository.save(employee);
//		employeeRepository.save(betterEmployee);
//	}


	@Test
	public void canDoManyToMany() {
		Department department = new Department("Department of Redundency Department");
		departmentRepository.save(department);
		Employee employee = new Employee("Graeme", "Congreve", 3, department);
		Employee betterEmployee = new Employee("Paul", "Wishart", 4, department);
		Employee bestEmployee = new Employee("Christina", "Harvey", 5, department);
		Employee worstEmployee = new Employee("Jake", "Thwaites", 6, department);
		Project project1 = new Project("tidy up", 4);
		Project project2 = new Project("make a mess", 5);
		employeeRepository.save(employee);
		employeeRepository.save(betterEmployee);
		employeeRepository.save(bestEmployee);
		employeeRepository.save(worstEmployee);
		projectRepository.save(project1);
		projectRepository.save(project2);
		project1.addEmployee(employee);
		project1.addEmployee(betterEmployee);
		project1.addEmployee(bestEmployee);
		worstEmployee.addProject(project2);
		betterEmployee.addProject(project2);
		employeeRepository.save(employee);
		employeeRepository.save(betterEmployee);
		employeeRepository.save(bestEmployee);
		employeeRepository.save(worstEmployee);
		projectRepository.save(project1);
		projectRepository.save(project2);
	}
}


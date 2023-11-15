package io.springboot.maven.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.springboot.maven.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
	
}

package com.thymeleaf.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleaf.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
}

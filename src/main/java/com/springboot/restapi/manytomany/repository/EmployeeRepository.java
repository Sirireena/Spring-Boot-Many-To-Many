package com.springboot.restapi.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.manytomany.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}

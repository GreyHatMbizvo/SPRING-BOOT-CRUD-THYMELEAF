package com.tmgreyhat.crud.repository;

import com.tmgreyhat.crud.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

   // Page<Employee>  findPaginated (int pageNo, int pageSize);

}

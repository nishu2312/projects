package com.nagarro.ecommapi1.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.nagarro.ecommapi1.Entity.Employee;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>
{
      Optional<Employee> findOneByEmailAndPassword(String email, String password);
 
      Employee findByEmail(String email);
}
package com.nagarro.ecommapi1.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.ecommapi1.Dto.EmployeeDTO;
import com.nagarro.ecommapi1.Dto.LoginDTO;
import com.nagarro.ecommapi1.Entity.Employee;
import com.nagarro.ecommapi1.Repo.EmployeeRepo;
import com.nagarro.ecommapi1.Service.EmployeeService;
import com.nagarro.ecommapi1.response.LoginResponse;

@RestController
@CrossOrigin
@RequestMapping()
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private final EmployeeRepo employeeRepo;
	
	public EmployeeController(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	@PostMapping(path ="api/v1/employee/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	@PostMapping(path ="api/v1/employee/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO) {
		
		LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginResponse);
	}
	

}

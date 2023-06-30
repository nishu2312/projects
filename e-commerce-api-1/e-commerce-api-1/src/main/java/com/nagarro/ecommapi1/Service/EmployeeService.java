package com.nagarro.ecommapi1.Service;

import com.nagarro.ecommapi1.Dto.EmployeeDTO;
import com.nagarro.ecommapi1.Dto.LoginDTO;
import com.nagarro.ecommapi1.response.LoginResponse;

public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);
	
	LoginResponse loginEmployee(LoginDTO loginDTO);
	
	
	
	

}

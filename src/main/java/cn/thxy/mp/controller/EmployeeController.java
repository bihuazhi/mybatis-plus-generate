package cn.thxy.mp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.thxy.mp.domain.Employee;
import cn.thxy.mp.service.EmployeeService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-14
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
		
	public List<Employee> getAll(){
	   return employeeService.selectList(null);
	}
}


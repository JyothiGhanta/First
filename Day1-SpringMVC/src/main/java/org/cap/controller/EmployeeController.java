package org.cap.controller;

import javax.validation.Valid;

import org.cap.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public ModelAndView showEmployeeForm(){
		return new ModelAndView("empPage", "employee", new Employee());
	}
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee  emp,
			BindingResult result){
		if(result.hasErrors()){
			return "empPage";
		}else{
			System.out.println(emp);
			
			return "showEmp";
		}
	}
}

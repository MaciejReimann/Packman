package hello.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.model.Employee;
import hello.repositories.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getEmployees(Model model) {
		model.addAttribute("employees", employeeRepository.findAll());
		return "employee/index";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String newEmployee(Model model,@ModelAttribute Employee employee) {
		employeeRepository.save(employee);
		return "redirect:/employee";
	}
	
	@RequestMapping(value = "/employee/new", method = RequestMethod.GET)
	public String employeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "employee/form";
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public String employeeForm(@PathVariable Long id, Model model) {
		Employee employee = employeeRepository.findOne(id);
		model.addAttribute("employee", employee);
		return "employee/form";
	}
	
}

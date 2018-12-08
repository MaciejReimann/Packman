package hello.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.services.NameService;

@Controller
public class MainController {
	
	@Autowired
	NameService nameService;
	
	@RequestMapping("/")
	public String test(Model model) {
		
		model.addAttribute("name", nameService.getName());
		return "index";
	}
}

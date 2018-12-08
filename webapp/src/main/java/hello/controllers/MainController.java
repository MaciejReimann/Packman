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
	public String main(Model model) {
		return "index";
	}

	@RequestMapping("/client")
	public String client(Model model) {
		return "client/index";
	}

	@RequestMapping("/parcel")
	public String parcel(Model model) {
		return "parcel/index";
	}
}

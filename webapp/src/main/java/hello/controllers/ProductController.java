package hello.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(value= "/product", method=RequestMethod.GET)
	public String getProducts(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "product/index";
	}
}

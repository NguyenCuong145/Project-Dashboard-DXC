package edu.spring.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.spring.thymeleaf.model.Person;

@Controller
public class MainController {
//	@RequestMapping("/variable-example1")
//	public String variableExample1(Model model, HttpServletRequest request) {
//		// variable 1
//		model.addAttribute("variable1", "Value of variable1!");
//		
//		// variable 2
//		model.addAttribute("variable2", "Value of variable1!");
//		
//		return "variable-example1";
//		
//	}
	
//	@RequestMapping("/variable-in-loop")
//	public String objectServletContext(Model model, HttpServletRequest request) {
//		String[] flowers = new String[] {"Rose","Lily", "Tulip", "Carnation", "Hyacinth" };
//		model.addAttribute("flowers", flowers);
//		return "variable-in-loop";
//		
//	}
	
	@RequestMapping("/variable-example3")
	public String variableExample3(Model model) {
		String[] flowers = new String[] {"Rose","Lily", "Tulip", "Carnation", "Hyacinth" };
		model.addAttribute("flowers", flowers);
		return "variable-example3";
		
	}
	
	@RequestMapping("/loop-example")
	public String loopExample(Model model) {
		String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };
		model.addAttribute("flowers", flowers);
		return "loop-example";
	}
	
	@RequestMapping("/loop-list-example")
	public String loopListExample(Model model) {
		Person tom = new Person(1, "Tom", "tom@waltdisney.com");
		Person jerry = new Person(2, "Jerry", "jerry@waltdisney.com");
		Person donald = new Person(3, "Donald", "donald@waltdisney.com");
		List<Person> list = new ArrayList<Person>();
		list.add(tom);
		list.add(jerry);
		list.add(donald);
		model.addAttribute("people", list);
		return "loop-list-example";
	}
	
}

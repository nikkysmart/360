package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.Employee;
import com.example.beans.JobDescription;
import com.example.service.JobDescriptionService;



public class JobDescriptionController {
	
	@Autowired
	JobDescriptionService jobDescriptionService;
	
	@GetMapping(value = "/") //Welcome Page for JDs
	public  String welcomeCustomer(Model model) {

		return "jdPage";
	}
	
	@PostMapping(value="/add") //to add a New JD
	public String openRegPage(Model model,JobDescription jobDescription) {
		//model.addAttribute("objJobDescription",objJobDescription);
		
		return "Added";
	}
	
	/*@GetMapping("/deleteJd/{id}")
	public String deleteEmployee(Model model,@PathVariable int id,JobDescription jobDescription) {
			System.out.println("inside deleteEmployee id:::"+id);
			JobDescriptionService.deleteEmployeeById(id);
			List<JobDescription> empList =jobDescriptionService.getAllJds();
			model.addAttribute("employeesList", empList);

		return "jdPage";
	}*/
	
	

}

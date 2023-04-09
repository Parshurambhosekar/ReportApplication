package com.parshuram.miniprojects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parshuram.miniprojects.binding.SearchRequest;
import com.parshuram.miniprojects.entity.CitizenPlan;
import com.parshuram.miniprojects.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	
	@GetMapping("/")//(given to form action in jsp)
	public String loadIndexPage(Model model) {
		
		//at the loading time the option is empty 
		//when user enter then it will not erase
		
		model.addAttribute("search", new SearchRequest());
		//send binding class object to UI
		//key is search(given to Model attribute in jsp)
		//value is request object
		
		init(model);
		
		return "index";
	}

	private void init(Model model) {
	
		
		model.addAttribute("names", reportService.getPlanName());
		//key is names bind to UI return the unique data from database
		
		model.addAttribute("status", reportService.getPlanStatus());
	}
	
	@PostMapping("/search")
	public String handelSearch(@ModelAttribute("search") SearchRequest request,Model model) {
		
		//model Attribute means....whatever form data getting in binding object
		//same data we will send to UI
		
		System.out.println(request);
		
		 List<CitizenPlan> plans = reportService.search(request);
		
		model.addAttribute("plans", plans);
		//to iterated the data in UI
		//key is plans value is plans list object
		
		
		init(model);//after selecting first search again it will load the form
		
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

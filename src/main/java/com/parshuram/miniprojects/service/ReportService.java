package com.parshuram.miniprojects.service;

import java.util.List;

import com.parshuram.miniprojects.binding.SearchRequest;
import com.parshuram.miniprojects.entity.CitizenPlan;

public interface ReportService {
	
	//method to get drop down name
	public List<String> getPlanName();
	
	//method to get drop down status
	public List<String> getPlanStatus();
	
	//method for search functionality
	//binding class take parameters are displaying to UI
	public List<CitizenPlan> search(SearchRequest request);
	
	//method for excel file generation
	public boolean excelGenerator();
	
	//method for pdf file generation
	public boolean pdfGenerator();
	
	
	

}

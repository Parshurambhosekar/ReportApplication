package com.parshuram.miniprojects.serviceimpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.parshuram.miniprojects.binding.SearchRequest;
import com.parshuram.miniprojects.entity.CitizenPlan;
import com.parshuram.miniprojects.repository.CitizenPlanRepository;
import com.parshuram.miniprojects.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private CitizenPlanRepository repository;

	@Override
	public List<String> getPlanName() {
		
		List<String> planName = repository.getCitizenPlanByName();
		//give unique plan names in database
		return planName;
	}

	@Override
	public List<String> getPlanStatus() {
		
		List<String> planStatus = repository.getCitizenPlanByStatus();
		//this gives plan status in database
		return planStatus;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		
		CitizenPlan citizenPlan=new CitizenPlan();
		
		if(request.getPlanName()!=null && request.getPlanName()!="") {
			citizenPlan.setPlanName(request.getPlanName());
		}
		
		if(request.getPlanStatus()!=null && request.getPlanStatus()!="") {
			citizenPlan.setPlanStatus(request.getPlanStatus());
		}
		
		if(request.getGender()!=null && request.getGender()!="") {
			citizenPlan.setGender(request.getGender());
		}
		
		if(request.getStartDate()!=null && request.getStartDate()!="") {
			//now convert String date to local Date
			String startDate = request.getStartDate();
			
			DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			LocalDate localDate=LocalDate.parse(startDate, dateTimeFormatter);
			
			citizenPlan.setPlanStartDate(localDate);	
		}
		
		if(request.getEndDate()!=null && request.getEndDate()!="") {
			//now convert String date to local Date
			String endDate = request.getEndDate();
			
			DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			LocalDate localDate=LocalDate.parse(endDate, dateTimeFormatter);
			
			citizenPlan.setPlanStartDate(localDate);
			
		}
		List<CitizenPlan> allTheRecords = repository.findAll(Example.of(citizenPlan));
		
		//example used to for dynamic Query(doing search operation for Selected fields only)
		
		return allTheRecords;
	}

	@Override
	public boolean excelGenerator() {
		
		return false;
	}

	@Override
	public boolean pdfGenerator() {
	
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

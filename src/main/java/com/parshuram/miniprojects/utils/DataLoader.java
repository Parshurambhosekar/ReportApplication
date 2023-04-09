package com.parshuram.miniprojects.utils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.parshuram.miniprojects.entity.CitizenPlan;
import com.parshuram.miniprojects.repository.CitizenPlanRepository;

@Component // marking as a spring bean
public class DataLoader implements ApplicationRunner {

	/*
	 * that class extend with runner which will be executed only ones at the
	 * starting of spring boot application... as per requirement hardcoded data will
	 * be available in database to perform the retrieval operation.
	 */

	@Autowired
	private CitizenPlanRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//this uses because duplicates data are not entered..
		//when we run our app then first it will delete all data
		//and then again load the data... 
		repository.deleteAll();
		

		// cash plan data
		CitizenPlan c1 = new CitizenPlan();
		c1.setName("Parshuram");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmout(7000.00);

		CitizenPlan c2 = new CitizenPlan();
		c2.setName("Sumit");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");

		CitizenPlan c3 = new CitizenPlan();
		c3.setName("Pratha");
		c3.setGender("Fe-Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmout(15000.98);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Employeed");

		CitizenPlan c4 = new CitizenPlan();
		c4.setName("Sumitra");
		c4.setGender("Fe-Male");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Denied");
		c4.setDenialReason("Outside Income");

		// food plan data
		CitizenPlan c5 = new CitizenPlan();
		c5.setName("Ashish");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Approved");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setBenefitAmout(3000.00);

		CitizenPlan c6 = new CitizenPlan();
		c6.setName("Chetan");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Denied");
		c6.setDenialReason("Rental Income");

		CitizenPlan c7 = new CitizenPlan();
		c7.setName("Sayali");
		c7.setGender("Fe-Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Terminated");
		c7.setPlanStartDate(LocalDate.now().minusMonths(4));
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmout(2000.35);
		c7.setTerminatedDate(LocalDate.now());
		c7.setTerminationReason("Goverment Job");

		CitizenPlan c8 = new CitizenPlan();
		c8.setName("Amita");
		c8.setGender("Fe-Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("XYZ");

		// Medical plan data
		CitizenPlan c9 = new CitizenPlan();
		c9.setName("Amit");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Approved");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmout(15000.00);

		CitizenPlan c10 = new CitizenPlan();
		c10.setName("Vrushabh");
		c10.setGender("Male");
		c10.setPlanName("Medical");
		c10.setPlanStatus("Denied");
		c10.setDenialReason("ABC");

		CitizenPlan c11 = new CitizenPlan();
		c11.setName("Alissa");
		c11.setGender("Fe-Male");
		c11.setPlanName("Medical");
		c11.setPlanStatus("Terminated");
		c11.setPlanStartDate(LocalDate.now().minusMonths(4));
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmout(22000.745);
		c11.setTerminatedDate(LocalDate.now());
		c11.setTerminationReason("Business");

		CitizenPlan c12 = new CitizenPlan();
		c12.setName("Mithali");
		c12.setGender("Fe-Male");
		c12.setPlanName("Medical");
		c12.setPlanStatus("Denied");
		c12.setDenialReason("Other");

		// Employment plan data
		CitizenPlan c13 = new CitizenPlan();
		c13.setName("David");
		c13.setGender("Male");
		c13.setPlanName("Employment");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmout(4000.24);

		CitizenPlan c14 = new CitizenPlan();
		c14.setName("Hardik");
		c14.setGender("Male");
		c14.setPlanName("Employment");
		c14.setPlanStatus("Denied");
		c14.setDenialReason("Personal Reason");

		CitizenPlan c15 = new CitizenPlan();
		c15.setName("Harmanpreet");
		c15.setGender("Fe-Male");
		c15.setPlanName("Employment");
		c15.setPlanStatus("Terminated");
		c15.setPlanStartDate(LocalDate.now().minusMonths(4));
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmout(11000.49);
		c15.setTerminatedDate(LocalDate.now());
		c15.setTerminationReason("Self Employeed");

		CitizenPlan c16 = new CitizenPlan();
		c16.setName("Prathana");
		c16.setGender("Fe-Male");
		c16.setPlanName("Employment");
		c16.setPlanStatus("Denied");
		c16.setDenialReason("Rental");

		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16);

		repository.saveAll(list);

	}

}

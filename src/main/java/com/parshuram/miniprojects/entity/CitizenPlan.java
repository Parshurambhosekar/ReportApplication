package com.parshuram.miniprojects.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "citizen_plan_info")
public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "citizen_id")
	private Integer id;
	@Column(name = "citizen_name")
	private String name;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmout;
	private String denialReason;//what is the reason
	private LocalDate terminatedDate;//when why terminated for the plan
	private String terminationReason;	

}

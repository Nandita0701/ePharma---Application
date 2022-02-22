package com.spring.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.model.Medicine;

@Service
public interface MedService {
	
	
	public int callAddMedDetails(Medicine med);

	public List<Medicine> callViewExpMeds();
	
	
	
	public int delete(int medId);
}

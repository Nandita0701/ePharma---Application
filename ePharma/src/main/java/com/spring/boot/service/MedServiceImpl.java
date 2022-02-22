package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.MedDaoImpl;
import com.spring.boot.model.Medicine;

@Service
public class MedServiceImpl implements MedService {

	@Autowired
	MedDaoImpl medimpl;
	
	@Override
	public int callAddMedDetails(Medicine med) {
		
		return medimpl.AddMedDetails(med);
	}

	@Override
	public List<Medicine> callViewExpMeds() {
		
		return medimpl.ViewExpMeds();
		
		
	}

	
	@Override
	public int delete(int medId) {
		return medimpl.delete(medId);
	}
	


}

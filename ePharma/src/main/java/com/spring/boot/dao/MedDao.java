package com.spring.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.boot.model.Medicine;

@Repository
public interface MedDao {
	
	public int AddMedDetails(Medicine med);

	public List<Medicine> ViewExpMeds();
	
	
	
	public int delete(int medId);

}

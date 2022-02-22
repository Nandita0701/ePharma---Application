package com.spring.boot.ePharma;



import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.boot.model.Medicine;
import com.spring.boot.service.MedService;

@RunWith(SpringRunner.class)
public class EPharmaApplicationTestsTest extends EPharmaApplicationTests{
	
	Medicine m=new Medicine(118,"dfksgk","23","fdhs",new Date(2019-05-05),new Date(2020-05-05),"Yes");
	@Autowired
	MedService medservice;
	@Test
	public void testingadd() {
		assertEquals(1,medservice.callAddMedDetails(m));
	}
	
	@Test
	public void testingdelete() {
		assertEquals(1, medservice.delete(m.getMedId()));
	}
}

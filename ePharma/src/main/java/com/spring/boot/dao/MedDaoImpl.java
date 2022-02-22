package com.spring.boot.dao;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.MedRowMapper;
import com.spring.boot.model.Medicine;


@Repository
public class MedDaoImpl implements MedDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int AddMedDetails(Medicine med) {
		
		String sql = "insert into Medicine(medName,medPrice,medPurpose,stock,mfgDate,expDate) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, med.getMedName(),med.getMedPrice(),med.getMedPurpose(),med.getStock(),new Date(med.getMfgDate().getTime()),new Date(med.getExpDate().getTime()));
	}

	@Override//check the query
	public List<Medicine> ViewExpMeds() {
		
		String sql = "select * from Medicine where expDate < curdate()";
		RowMapper<Medicine> rowMapper = new MedRowMapper();
		return jdbcTemplate.query(sql,rowMapper );
	}

	
	@Override
	public int delete(int medId) {
		String sql="delete from Medicine where medId="+medId;
		return jdbcTemplate.update(sql);
	}

}

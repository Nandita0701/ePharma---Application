package com.spring.boot.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MedRowMapper implements RowMapper<Medicine>{

	@Override
	public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
		Medicine medicine=new Medicine();
		medicine.setMedId(rs.getInt(1));
		medicine.setMedName(rs.getString(2));
		medicine.setMedPrice(rs.getString(3));
		medicine.setMedPurpose(rs.getString(4));
		medicine.setStock(rs.getString(5));
		medicine.setMfgDate(rs.getDate(6));
		medicine.setExpDate(rs.getDate(7));
		
		return medicine;
	}

}
 
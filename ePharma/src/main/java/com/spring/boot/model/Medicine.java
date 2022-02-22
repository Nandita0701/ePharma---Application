package com.spring.boot.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

public class Medicine {

	private int medId;
    
	@NotBlank(message = "Shouldn't be left blank")
	private String medName;
	@Min(1)
	@NotBlank(message = "Shouldn't be left blank")
    private String medPrice;
	
	@NotBlank(message = "Shouldn't be left blank")
	private String medPurpose;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mfgDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expDate;
	
	@NotBlank(message = "Shouldn't be left blank")
	private String stock;
	
    public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(int medId, @NotBlank String medName, @NotBlank String medPrice, @NotBlank String medPurpose,
			 Date mfgDate, Date expDate, @NotBlank String stock) {
		super();
		this.medId = medId;
		this.medName = medName;
		this.medPrice = medPrice;
		this.medPurpose = medPurpose;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.stock = stock;
	}

	public int getMedId() {
		return medId;
	}

	public void setMedId(int medId) {
		this.medId = medId;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getMedPrice() {
		return medPrice;
	}

	public void setMedPrice(String medPrice) {
		this.medPrice = medPrice;
	}

	public String getMedPurpose() {
		return medPurpose;
	}

	public void setMedPurpose(String medPurpose) {
		this.medPurpose = medPurpose;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	
	
	
}


package com.spring.boot.MedController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.model.Medicine;
import com.spring.boot.service.MedServiceImpl;


@Controller
public class MedController {
	
	@Autowired
	MedServiceImpl medSImpl;
	
	
	@RequestMapping({"/","/home"})
	public String showHome() {
		return "home";
	}
	
	
	@RequestMapping("/addMedicine")
	public String showAddMedicinePage() {

		return "addMedicine";
	}
	
	@RequestMapping("/addMedDetails")
	public String addMedicineDetails(@Valid @ModelAttribute("med") Medicine medicine,BindingResult bindResult ,ModelMap model) {

		if(bindResult.hasErrors()) {
			return "addMedicine"; 
		}
		else if(medicine.getMfgDate().after(medicine.getExpDate())) {
			model.addAttribute("errormsg","Manufacturing date should be before Expiry date");
		}
		
		else {
		medSImpl.callAddMedDetails(medicine);
		model.addAttribute("msg", "Medicine details added!!!");}
		return "addMedicine";
	}

	
	@RequestMapping("/expMedicine")
	public String viewExpMeds(ModelMap model) {

		List<Medicine> medList=medSImpl.callViewExpMeds();
		
		model.addAttribute("medList", medList);
		return "ViewExpMed";
	}
	
	 @RequestMapping(value="/delete/{id}")    
	    public String delete(@PathVariable int id){    
	        medSImpl.delete(id);    
	        return "redirect:/expMedicine";    
	    } 
}


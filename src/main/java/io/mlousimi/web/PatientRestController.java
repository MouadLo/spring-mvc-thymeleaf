package io.mlousimi.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import io.mlousimi.dao.PatientRepository;
import io.mlousimi.entities.Patient;

@RestController
public class PatientRestController {

	@Autowired
	private PatientRepository patientRepository;

	@GetMapping("/listPatients")
	public List<Patient> list(){
		return patientRepository.findAll();
	}
	
	@GetMapping("/patient/{id}")
	public Patient getOne(@PathVariable Long id){
		return patientRepository.findById(id).get();
	}
}

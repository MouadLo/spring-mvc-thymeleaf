package io.mlousimi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mlousimi.dao.PatientRepository;
import io.mlousimi.entities.Patient;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {

    @Autowired
	private PatientRepository patientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null, "Mouad", new Date(), false, 97));
		patientRepository.save(new Patient(null, "Soufian", new Date(), false, 50));
		patientRepository.save(new Patient(null, "Imane", new Date(), false, 10));
		
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	}

	
}

package io.mlousimi.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import io.mlousimi.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	public Page<Patient> findByNameContains(String keyword, Pageable pageable);
}

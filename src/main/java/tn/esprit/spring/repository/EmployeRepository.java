package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entities.Employe;

import tn.esprit.spring.entities.Role;


@Repository
public interface EmployeRepository extends CrudRepository<Employe, Integer>  {

	
	
	
	
}
